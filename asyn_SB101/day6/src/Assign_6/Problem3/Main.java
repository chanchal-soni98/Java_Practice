package Assign_6.Problem3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Common c = new Common();
		Consumer cs = new Consumer(c);
		Producer p = new Producer(c);
		
		cs.start();
		p.start();

	}

}
