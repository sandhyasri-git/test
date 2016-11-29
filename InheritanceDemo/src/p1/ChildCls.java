package p1;

class BaseCls
{
	private int i;
	public int j;
	protected int k;
	public void showDetails()
	{
		
		i=10;
		j=20;
		k=30;
		System.out.println("i is "+i+" j is "+j+" k is "+k);
	}
}

public class ChildCls extends BaseCls {
	private int i;
	public int j;
	protected int k;
	public void showDetails()
	{
		super.showDetails();
		i=1;j=2;
		k=3;
		System.out.println("i is "+i+" j is "+j+" k is "+k);
	}

	public static void main(String[] args) {
		ChildCls c1 =new ChildCls();
		c1.showDetails();
		
	}

}





