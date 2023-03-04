package mainPack.Problem2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] s= {
				new Student(1,"Ram",800),
				new Student(2,"Shyam",500),
				new Student(3,"Shiv",480),
				
		};
		 ExecutorService es=Executors.newFixedThreadPool(3); 
		 for(Student a :s){  
			 Future f=  es.submit(a); 
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
