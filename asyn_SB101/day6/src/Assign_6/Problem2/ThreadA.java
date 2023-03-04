package Assign_6.Problem2;

public class ThreadA extends Thread{
	
	int p = 1 ; 
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			System.out.println("multiplication");
			
			for(int i = 1 ;i<=10 ; i++) {
				p*=i;
				
			}	
			System.out.println("done");
			this.notify();
		}
		
	}

}
