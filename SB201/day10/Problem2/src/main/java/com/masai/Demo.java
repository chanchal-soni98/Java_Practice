package com.masai;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	    Travel t = context.getBean(Travel.class);
	 
	    t.getBike().ride();
	    t.getCar().drive();
	    t.cleanup();
	 
	 
	 AnnotationConfigApplicationContext a= (AnnotationConfigApplicationContext)context;
	 a.close();
	}

}
