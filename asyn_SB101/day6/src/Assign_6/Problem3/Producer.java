package Assign_6.Problem3;

public class Producer extends Thread{
	
	Common c  = new Common();
	
	public Producer(Common c) {
		this.c = c;
		
	}
	
	@Override
	public void run() {
		int i=1;
		while(i<11) {
			c.produce(i);
			i++;
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
