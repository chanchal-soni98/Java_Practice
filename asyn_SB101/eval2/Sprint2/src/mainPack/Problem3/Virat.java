package mainPack.Problem3;

public class Virat extends Thread{
	
	@Override
	public void run() {


		int sum = 0;
		for(int i=1;i<=20;i++) {
			
			sum+=i;
			
		}
		System.out.println(Thread.currentThread().getName()+" "+sum);
		
		
	}


}
