package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class JobAvailabilityImpl implements JobAvailability{
	@Autowired
	JobCounsaltancy jobCounsaltancy;
	
	@Override
	public void findJob(String message) {
		// TODO Auto-generated method stub
		
		jobCounsaltancy.weAreHiring(message);
		
		
	}

}
