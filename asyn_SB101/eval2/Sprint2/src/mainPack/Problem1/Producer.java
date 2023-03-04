package mainPack.Problem1;

public class Producer extends Thread{
	
	Common c ;

	public Producer(Common c) {
//		super();
		this.c = c;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			c.produce(i);
			i++;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
	


