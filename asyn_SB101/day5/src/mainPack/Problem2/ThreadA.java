package mainPack.Problem2;

public class ThreadA extends Thread{

	Thread t1; // here we are expecting the main thread object
	
	ThreadA(Thread t1){
		this.t1= t1;
	}
	
	@Override
	public void run() {
	
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for(int i=1;i<=20;i++) {
			if(i%2==0)
			  System.out.println(i);
		}
		
		
	}

}
