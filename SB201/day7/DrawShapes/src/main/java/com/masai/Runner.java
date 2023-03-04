package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	Shapes s;
	

	public void setS(Shapes s) {
		this.s = s;
	}
	
	public void gameShapes() {
		s.draw();
		System.out.println("printed...");
	}


	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Runner run = ctx.getBean(Runner.class,"r");
		
		run.gameShapes();
		
		// TODO Auto-generated method stub

	}

}
