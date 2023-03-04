package mainPack.Problem1;

import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class MyCallable implements Callable{
	
	int n ;
	MyCallable(int n){
		this.n = n;
	}

	@Override
	public Object call() throws Exception {
		
		System.out.println(Thread.currentThread().getName()+" "+n);
		if(n%2==0) {
			return "Even Number";
		}else {
			return "Odd Number";
		}
		// TODO Auto-generated method stub
		
	}

}
