package com.masai;

public class Travel {
	
	Vehicle v;
	
//	setter injection
	
	public void setV(Vehicle v) {
		this.v = v;
	}


//constructor injection
	public Travel(Vehicle v) {
	
	this.v = v;
}



	public void journey() {
		
		v.go();
		System.out.println("Journey started...");
		
	}

}
