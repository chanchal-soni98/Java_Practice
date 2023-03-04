package mainPack.Problem3;

public class Dhoni extends Thread{
	
	@Override
	public void run() {
		
		
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}

	

	
}
