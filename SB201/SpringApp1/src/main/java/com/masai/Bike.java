package com.masai;

public class Bike implements Vehicle{
	
	public void ride() {
		System.out.println("ride starts......");
	}

	@Override
	public void go() {
		
		ride();
		// TODO Auto-generated method stub
		
	}

}
