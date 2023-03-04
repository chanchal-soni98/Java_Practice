package com.masai;

public class GameRunner {
	
	SuperContaGame scg = new SuperContaGame();
	PacManGame pmg = new PacManGame();
	MarioGame mg = new MarioGame();
	
	public void run(){
		System.out.println("Game is started");
		scg.down();
		pmg.up();
		mg.left();
		
		//here it needs Dependencies
	}

}
