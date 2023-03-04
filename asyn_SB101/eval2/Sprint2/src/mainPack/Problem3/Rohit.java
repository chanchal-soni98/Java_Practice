package mainPack.Problem3;

public class Rohit extends Thread{
	
	@Override
	public void run() {
		
		int p = 1;
		for(int i=1;i<=10;i++) {
			p*=i;
		}
		System.out.println(Thread.currentThread().getName()+" "+p);
	}
	
	
}
