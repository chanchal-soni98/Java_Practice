package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(JobAvailabilityImpl.class);
		ctx.refresh();

		JobAvailability jobAvailability = ctx.getBean(JobAvailability.class);
		
		System.out.println(jobAvailability);
		
	}

}
