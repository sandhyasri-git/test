package p2;

public class Bground extends Thread{

	public static void main(String[] args) {
        Bground b = new Bground();
        b.run();
       
	}
    public void start() {
        for (int i = 0; i <10; i++) {
            System.out.println("Value of i = " + i);
        }
    }

}
