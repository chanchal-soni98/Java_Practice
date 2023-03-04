package mainPack.Problem2;

public class ThreadB extends Thread{

	Thread t2; // here we are expecting the main thread object
	
	ThreadB(Thread t2){
		this.t2= t2;
	}
	
	@Override
	public void run() {
	
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=20;i++) {
			if(i%2==1)
			  System.out.println(i);
		}
		
		
	}
}
