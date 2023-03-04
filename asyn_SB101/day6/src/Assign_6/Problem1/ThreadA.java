package Assign_6.Problem1;

public class ThreadA extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			Thread.currentThread().setName("One_Thread");
			for(int i=1; i<=10;i++){

				System.out.println(Thread.currentThread().getName()+" is running"+i);

			}
			this.notify();
		}		
	}
}
