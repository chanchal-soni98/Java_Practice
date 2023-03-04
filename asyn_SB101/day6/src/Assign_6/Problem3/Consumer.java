package Assign_6.Problem3;

public class Consumer extends Thread{
	
	Common c;
	
	public Consumer(Common c) {
		this.c = c;
		
	}
	
	@Override
	public void run() {
		int i = 1;
		while(i<11) {
			int x = c.consume();
			System.out.println("Consumed "+x);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
