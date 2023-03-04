package com.masai;

public class MarioGame implements Game{

	String mg = "MarioGame";

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println(mg+" up");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println(mg+" down");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println(mg+" left");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println(mg+" rigth");
		
	}

}
