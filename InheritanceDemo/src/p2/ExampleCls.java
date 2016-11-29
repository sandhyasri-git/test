package p2;

abstract class Prod {
    public abstract void prmth1();
    public static void prmth2() {
      int mth2 = 30;
     System.out.println("prmth2 = " + mth2);
    }
      public abstract void prmth3();
   }


public class ExampleCls extends Prod{

	public static void main(String[] args) {
		prmth2();

	}

	@Override
	public void prmth1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prmth3() {
		// TODO Auto-generated method stub
		
	}

}
