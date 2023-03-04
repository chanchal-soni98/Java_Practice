package com.masai;

import org.springframework.stereotype.Component;

@Component
public class WeekendsJob implements JobCounsaltancy{

	@Override
	public void weAreHiring(String message) {
		
		System.out.println("weekends: "+message);
		
	}

}