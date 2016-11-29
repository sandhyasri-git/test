package p1;


public final class FinalCls {
	final int i=10;
	
	public final void showMethod()
	{
		System.out.println("Final Method");
		
	}
	public static void main(String[] args) {
		
		FinalCls f1= new FinalCls();
		f1.showMethod();

	}

}
