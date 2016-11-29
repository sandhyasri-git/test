package p1;

public class ThreadDemo {

	/*int x = 30; 
   		public static void main ( String[] args) {  
            int x = 20; 
            ThreadDemo ta = new ThreadDemo(); 
            ta.Method(x); 
            System.out.println("The x value is " + x); 
    } 
    void Method(int y){ 
    int x = y * y; 
    } 
*/
public static void main(String a[])
{
	Derived d= new Derived(10);
	
}
        
  }  
class Base
{
	public Base(int i)
	{
		
	}
}
class Derived extends Base
{
	Derived(int i)
	{
		super(i);
	}
	Derived(String str,int i)
	{
		this(i);
		Base b= new Base(1);
	}
}
