package com.masai;

public class GameRunner {
	
	Game g;
	
//	setter injection
	public void setG(Game g) {
		this.g = g;
	}

	public void run(){
		System.out.println("Game is started");
		//here it needs Dependencies
		g.up();
		g.down();
		g.right();
		g.left();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameRunner gr = new GameRunner();
		
//		gr.setG(new MarioGame());
//		gr.setG(new PacManGame());
		gr.setG(new SuperContaGame());
		
		gr.run();

	}

}
