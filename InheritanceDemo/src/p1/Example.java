package p1;

public class Example {
	private int i;
	public int j;
	protected int k;
	public  Example(int z)//Constructor of Parent
	{
		i=10;
		j=20;
		k=30;
		System.out.println("In Super class constructor");
	}
	
	public void displayDetails()
	{
		System.out.println("Example class");
	}
	

}
