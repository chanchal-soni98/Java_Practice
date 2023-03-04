package mainPack.Problem1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		MyCallable [] num = {
				new MyCallable(12),
				new MyCallable(67),
		};
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for(MyCallable c : num) {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			Future f = es.submit(c);
			System.out.println(f.get()); 
		}
		es.shutdown();
	}

}
