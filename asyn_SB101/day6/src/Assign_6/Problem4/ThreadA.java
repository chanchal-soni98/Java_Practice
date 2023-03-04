package Assign_6.Problem4;

public class ThreadA extends Thread{
	
	@Override
	public void run() {
		synchronized(this) {
			int n = 10;
			int i = 0;
			int j = 1;
			System.out.println("Fibonacci of n: "+n);
			
			for(int k=1;k<=n;k++) {
				System.out.println(i);
				int m = i+j;
				i = j;
				j = m;
				
			}
			
			this.notify();
			
		}
	}
}
