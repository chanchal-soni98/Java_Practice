package Assign_6.Problem3;

public class Common {
	
	int x;
	boolean flag = true ; 
	
	public synchronized void produce (int i ) {

		if(flag==true) {
			x=i;
			System.out.println("Produced : "+x);
			flag = false ;
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public synchronized int consume() {
		if(flag ==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag =true;
		this.notify();
		
		return x;
	}

}
