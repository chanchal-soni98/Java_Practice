package com.masai.problem2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(A :: funA);
//		Thread  t2 = new Thread(A :: funB);
		t1.setName("Dhoni");
//		t2.setName("Kohli");
		t1.start();
//		t2.start();
//		System.out.println(Thread.currentThread().getName()+" is running");

	}

}
