package mainPack.Problem2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student [] st = {
				new Student(1,"Ram","Delhi",450),
				new Student(2,"Shyam","Pune",550),
				new Student(3,"Ramu","Goa",350),
				new Student(10, "Varun", "Pune", 750),
				
		};
		
		ExecutorService es = Executors.newFixedThreadPool(6);
		for(Student x:st) {
			Future<?> f = es.submit(x);
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		es.shutdown();
	}

}
