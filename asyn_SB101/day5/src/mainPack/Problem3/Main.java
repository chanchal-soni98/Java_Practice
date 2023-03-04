package mainPack.Problem3;


public class Main {
	public static void main(String[] args) {
		Salman a = new Salman(Thread.currentThread());
		Hritik b = new Hritik(Thread.currentThread());
		
		a.start();
		b.start();

	}
}
