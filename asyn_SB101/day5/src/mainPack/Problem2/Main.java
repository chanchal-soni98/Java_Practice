package mainPack.Problem2;

public class Main {

	public static void main(String[] args) {
		ThreadA a = new ThreadA(Thread.currentThread());
		ThreadB b = new ThreadB(Thread.currentThread());
		
		a.start();
		b.start();

	}

}
