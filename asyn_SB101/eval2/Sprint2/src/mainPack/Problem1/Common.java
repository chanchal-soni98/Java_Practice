package mainPack.Problem1;

public class Common {
	
	int value;
	boolean flag = true;
	public synchronized void produce(int i) {
		if(flag == true) {
			value = i;
			System.out.println("Producer Produced :"+i);
			flag = false;
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized  int consume() {
		
		if(flag = true) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = true;
		this.notify();
//		value+=value;
		return value;
		
	}

}
