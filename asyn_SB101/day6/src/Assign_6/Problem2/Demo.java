package Assign_6.Problem2;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        ThreadA x = new ThreadA();
		
		
		x.start();
		synchronized (x) {
		System.out.println("wait method");
		x.wait();
		System.out.println("main thread");
		System.out.println(x.p);
		}

	}

}
