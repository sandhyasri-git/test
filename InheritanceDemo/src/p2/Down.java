package p2;

class Top { 
	 void myTop(String str) { 
	      System.out.println("Testing myTop method in Top class"); 
	   } 
	} 

public class Down extends Top {

    void myTop(int x) { 
        System.out.println("Testing myTop method in Down class"); 
  } 

	public static void main(String[] args) {
        Top t = new Down(); 
       // t.myTop(1); 

	}

}
