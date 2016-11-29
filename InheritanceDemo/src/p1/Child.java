package p1;

import java.io.EOFException;
import java.io.IOException;

class Parent
{// constructor
	public Parent(int i)
	{
		System.out.println("Super class constructor ");
	}
	protected void show()
	{
		System.out.println("Parent method");
	}
}
/*class sample extends Parent
{
	public sample()
	{
		System.out.println("sample constructor");
	}
	public void showSample()
	{
		super.show();
		System.out.println("sample method");
	}
}*/
/*class MyExp {  
    void MyMethod() throws IOException, EOFException { 
          //............// 
    }  
}  
class MyExp1 extends MyExp { 
     void MyMethod() { 
        //..........// 
     }  
}  
 class MyExp2 extends MyExp1 {  
      void MyMethod() throws IOException { 
           //.........// 
      }  
}  */

public class Child extends Parent{
	
	public Child()
	{
		super(0);
		System.out.println("Child constructor ");
	}
	public void show()
	{
		super.show();
		System.out.println("Child method");
		int i = 100;  
		  switch (i) {  
		  case 100:  
		      System.out.println(i);  
		  case 200:  
		      System.out.println(i);  
		  case 300:  
		      System.out.println(i);  
		      
		}  

	}
	public static void main(String[] args) {
		
		Child c1= new Child();
		c1.show();
		/*sample s1= new sample();
		s1.showSample();*/
	}

}
