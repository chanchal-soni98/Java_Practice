package mainPack.Problem3;

public class Hritik extends Thread{
	Thread t1; // here we are expecting the main thread object
	
	Hritik(Thread t1){
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
	
		for(int i=0;i<=20;i++) {
			if(i%2!=0)
			  System.out.println(i);
		}
		
	}

}
