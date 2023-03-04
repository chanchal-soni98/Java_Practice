package Assign_6.Problem1;

public class Demo {

	public static void main(String[] args) {
		Thread.currentThread().setName("Main Thread");
		ThreadA x = new ThreadA();
		x.start();
		synchronized (x) {
		try {
			x.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(x);	
			
		}
	}

}
