package mainPack.Problem1;

public class Main {

	public static void main(String[] args) {

		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		Thread x = new Thread(a);
		Thread y = new Thread(b);
		
		x.setName("Dhoni");

		y.setName("Kohli");
		
//		x.setPriority(3);
//		y.setPriority(7);
		
		x.start();
		y.start();
	}

}

