package threadM;

public class ThreadC extends Thread {
	@Override
	public void run() {
	for (int i = 20; i < 30; i++) {
	System.out.println("inside run mehod of ThreadC" + i);
	}
	System.out.println("end of ThreadC");
	}
}
