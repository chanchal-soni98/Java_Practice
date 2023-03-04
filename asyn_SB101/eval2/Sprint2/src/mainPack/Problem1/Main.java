package mainPack.Problem1;

public class Main {

	public static void main(String[] args) {

		Common c = new Common();
		Consumer cs = new Consumer(c);
		Producer p = new Producer(c);
		
		cs.start();
		p.start();
		

	}

}
