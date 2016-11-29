package p2;

import java.io.IOException;

class TechnoSampleSub extends TechnoSample {
	void test() {
		System.out.println("In TechnoSampleSub");
	}
}

public class TechnoSample {

	public static void main(String[] args)  {
		TechnoSampleSub myref = new TechnoSampleSub();
		myref.test();
	}
	void test() throws IOException{
		System.out.println("In TechnoSample");
		throw new IOException();
	}
}
		/*new TechnoSample().doSomething();
	}
	public void doSomething(){
		int i=5;
		Thread t = new Thread(new Runnable(){
			public void run(){
				for(int j=0;j<=i;j++){
					System.out.print(" "+j);
				}
			}
		});
		t.start();
	}*/
		/*Thread t1 = new Thread(getRunnable(3));
		Thread t2 = new Thread(getRunnable(4));
		t1.join();
		System.out.println("End");
	}

	public static Runnable getRunnable(final int id){
		return new Runnable(){
			public void run(){
				for(int i = 0; i < id; i++){
					System.out.print(" "+i);
				}
			}
		};
*/
       /* TechnoSample inc = new TechnoSample();
        int i =0; 
        inc.fermin(i);
        i = i++;
        System.out.println(i);
    }

    void fermin(int i) {
        i++;
    }

	}
*/




	

