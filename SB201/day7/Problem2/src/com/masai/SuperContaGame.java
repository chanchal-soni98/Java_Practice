package com.masai;

public class SuperContaGame implements Game{
	
	String scg = "SuperContaGame";

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println(scg+" up");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println(scg+" down");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println(scg+" left");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println(scg+" rigth");
		
	}

}
