package com.masai;

import java.time.LocalDate;

public class HolidayPackage {
	
	private String package_name;  // "Way to Hawai"
	private Tourist tourist; 
	private String package_expiry;
	private int package_price;
	
	public void showDetails(){
		System.out.println("Package Name is :"+package_name);
		System.out.println("Package Expiry Date is :"+package_expiry);
		System.out.println("Holiday Package register by Tourist is :"+tourist);
		}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	public Tourist getTourist() {
		return tourist;
	}

	public void setTourist(Tourist tourist) {
		this.tourist = tourist;
	}

	public String getPackage_expiry() {
		return package_expiry;
	}

	public void setPackage_expiry(String package_expiry) {
		this.package_expiry = package_expiry;
	}

	public int getPackage_price() {
		return package_price;
	}

	public void setPackage_price(int package_price) {
		this.package_price = package_price;
	}
	
	

}
