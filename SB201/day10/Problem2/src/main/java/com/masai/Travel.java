package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Travel {
	
	@Autowired
	private Car car;
	@Autowired
	private Bike bike;
	
	@PostConstruct
	public void init() {
		System.out.println("Travel init method...");
		
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("Travel destroy method..");
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
	

}
