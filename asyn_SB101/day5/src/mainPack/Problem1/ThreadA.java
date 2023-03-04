package mainPack.Problem1;

public class ThreadA implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+Thread.MIN_PRIORITY+" "+i);
		}
		
		
	}

}
