package com.masai.problem1;

public class akshya extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Akshya");
		}
	}
	
	public static void main(String[] args) {

		salman t1 = new salman();
		hritk t2 = new hritk();
		akshya t3 = new akshya();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
