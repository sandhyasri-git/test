package p1;

abstract class Vehicle
{
	public void method1()
	{
		System.out.println("Method 1");
	}
	public abstract void method2();
}

class ThreeWheeler extends Vehicle
{
	public void method2()
	{
		System.out.println("Three wheeler class -- Method 2");
		
	}
}
public class TwoWheeler extends Vehicle {
	
	public void method2()
	{
		System.out.println("Two wheelel class -- Method ");
	}
	public static void main(String[] args) {
		TwoWheeler t1= new TwoWheeler();
		t1.method1();
		t1.method2();
		ThreeWheeler t2= new ThreeWheeler();
		t2.method1();
		t2.method2();
		
		
	}

}
