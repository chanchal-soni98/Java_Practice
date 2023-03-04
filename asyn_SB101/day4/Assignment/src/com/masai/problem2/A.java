package com.masai.problem2;

public class A {
	
	public static void funA(){

		for(int i=1;i <=10; i++){

			System.out.println(Thread.currentThread().getName()+" is running");
			
//			System.out.println("inside funA "+i);

		}

	}

	public void funB(){

		for(int i=20;i <=30; i++){

			System.out.println(Thread.currentThread().getName()+" is running");

		}

	}

}
