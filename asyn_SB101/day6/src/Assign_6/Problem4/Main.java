package Assign_6.Problem4;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadA fibonacci = new ThreadA();
		
		fibonacci.start();
		fibonacci.join();
		
		synchronized(fibonacci) {
			for(int i=10;i>=1;i--) {
				System.out.println("Reverse "+i);
			}
			
			fibonacci.wait();
		}

	}

}

