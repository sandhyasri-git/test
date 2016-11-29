package p1;

public class Test extends Example {
	
	public Test(String str,int x)
	{
		super(x);
		System.out.println("Sub class constructor with String and int parameters");
	}
	public  Test(int x,String str)
	{
		super(x);
		System.out.println("Constructor with two parameter");
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Test class");
	}
	public static void main(String[] args) {
		Test t2= new Test(10,"xyz");
		Test t1= new Test("sandhya",1);
		//t1.displayDetails();
		
		
	}

}
