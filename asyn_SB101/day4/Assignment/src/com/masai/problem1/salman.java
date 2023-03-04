package com.masai.problem1;

public class salman extends Thread{
	@Override
	public void run() {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
