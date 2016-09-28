package com.flipmart.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.flipmart.model.Customer;
import com.flipmart.model.Item;
import com.flipmart.service.CustomerService;
import com.flipmart.service.ItemService;

@Controller
public class AdminController {
	@Autowired
	ItemService itemService;
	@Autowired
	CustomerService c;
	@RequestMapping("/addItem")
	public ModelAndView addItem()
	{
		Item item=new Item();
		return new ModelAndView("addItem","item",item);
	}
	@RequestMapping("/ViewCustomers")
	public ModelAndView viewCustomers() throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Customer> list=c.viewCustomers();
		System.out.println("List is:"+list);
		ObjectMapper mapper=new ObjectMapper();
		String listJSON=mapper.writeValueAsString(list);
		System.out.println(listJSON);
		return new ModelAndView("ViewCustomers","listOfCustomers",listJSON);
	}
	@RequestMapping("/addProduct")
	public String addProd(@ModelAttribute("item")Item item,@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException
	{
		System.out.println("item name:"+item.getItemName());
		itemService.addItem(item);
		MultipartFile itemImage=item.getFile();
		
		//D:\project1\FlipMart\src\main\webapp\resources\images
		Path path=Paths.get("D://project1//FlipMart//src//main//webapp//resources//images//"+item.getItemId()+".jpg");
		 if (itemImage != null && !itemImage.isEmpty()) {
			 itemImage.transferTo(new File(path.toString()));
			 System.out.println("image added");
		 }
		System.out.println("Item Added");
		return "redirect:/ViewItems";
	}
	
	/*@RequestMapping("/updateItem")
	public String updateItem(@RequestParam("itemName")String name)
	{
		System.out.println("Edited item name:"+name);
		return null;
	}*/
	@RequestMapping("/ViewItems")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Item> items=itemService.viewItems();
		ObjectMapper mapper=new ObjectMapper();
		String jsonData=mapper.writeValueAsString(items);
		System.out.println("json data:"+jsonData);
		return new ModelAndView("viewProducts","items",jsonData);
	}
	@RequestMapping("/deleteItem")
	public String deleteItem(@RequestParam("id") int id)
		{
			itemService.deleteItem(id);
			return "redirect:/ViewItems";
		}
		@RequestMapping("/editItem")
		public ModelAndView editItem(@RequestParam("id") int id)
			{
				System.out.println("id:"+id);
				Item item=itemService.getItemById(id);
				System.out.println("Item Name:"+item.getItemName());
				return new ModelAndView("uniqueItem","item",item);
			}
		@RequestMapping("/updateThisItem")
		public String updateThisItem(@RequestParam("itemId") String itemId,@RequestParam("itemName") String itemName,@RequestParam("description") String description,@RequestParam("category") String category,@RequestParam("price") String price)
			{
			    int iteId=Integer.parseInt(itemId);
			    Item item=itemService.getItemById(iteId);
			    item.setItemName(itemName);
			    item.setCategory(category);
			    item.setDescription(description);
			    item.setPrice(Float.parseFloat(price));
			    itemService.updateItem(item);
			    
			return "redirect:/ViewItems";
			}
		
		
	}


