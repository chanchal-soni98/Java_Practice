package com.masai;

import org.springframework.stereotype.Component;

@Component
public class PartTimeJob implements JobCounsaltancy{

	@Override
	public void weAreHiring(String message) {
		// TODO Auto-generated method stub
		System.out.println("PartTime: "+message);
		
	}

}
