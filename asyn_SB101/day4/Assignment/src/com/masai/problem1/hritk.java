package com.masai.problem1;

public class hritk extends Thread{
	@Override
	public void run() {
		int p = 1;
		for(int i=1;i<=10;i++) {
			p*=i;
		}
		System.out.println(p);
	}

}
