package mainPack.Problem3;

public class Main {

	public static void main(String[] args) {

		Virat v = new Virat();
		Dhoni d = new Dhoni();
		Rohit r = new Rohit();
		
		v.setName("Virat");
		d.setName("Dhoni");
		r.setName("Rohit");
		
		d.setPriority(10);
//		r.setPriority(NORM_PRIORITY);
//		v.setPriority(MIN_PRIORITY);
		
		d.start();
		
		try {
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r.start();
		
		try {
			r.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		v.start();
		
		try {
			v.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}


}
