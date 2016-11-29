package p2;

class Vehicle { 
    String str ; 
    public Vehicle() { 
    } 
    public Vehicle ( String s ) { 
    str = s; 
    } 
} 


public class Car {

	public static void main(String[] args) {
		 Vehicle v = new Vehicle ( " Hello" ); 
        v =  new Vehicle ( " How are you"); 
        v.str = "How is going"; 
System.out.println( "Greeting is : "  + v.str ); 

	}

}
