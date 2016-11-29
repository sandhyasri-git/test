package p1;

class Employee
{
	public Employee()
	{
		System.out.println("Grand Parent");
	
	}
	public void showDetails()
	{
		System.out.println("Employee class");
	}
}
class Manager extends Employee
{
	public Manager()
	{
		System.out.println("Parent ");
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Manager class");
	}
}

public class Director extends Manager {
	public Director()
	{
		System.out.println("Grand child of Employee and child Of Manager");
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Director class");
	}

	public static void main(String[] args) {
		
		Director d1= new Director();
		d1.showDetails();
	}

}
