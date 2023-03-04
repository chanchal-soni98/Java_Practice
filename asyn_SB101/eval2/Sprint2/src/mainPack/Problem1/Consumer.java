package mainPack.Problem1;

public class Consumer extends Thread{
	
	Common c ;

	public Consumer(Common c) {
//		super();
		this.c = c;
	}
	
	@Override
	public void run() {
		int sum=0;
		while(true) {
			int x = c.consume();
			
			sum+=x;
			System.out.println("Consumer Calculated Sum is: "+sum);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
