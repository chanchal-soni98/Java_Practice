package com.masai;

public class PacManGame implements Game{

	String pmg = "PacManGame";

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println(pmg+" up");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println(pmg+" down");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println(pmg+" left");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println(pmg+" rigth");
		
	}

}
