package com.masai;
import org.springframework.stereotype.Component;

@Component
public class FullTimeJob implements JobCounsaltancy{

	@Override
	public void weAreHiring(String message) {
		// TODO Auto-generated method stub
		System.out.println("FullTime : "+message);
		
	}


}
