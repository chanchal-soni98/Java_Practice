package com.masai.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class Product {
	@Min(value = 10, message = "Id should start with 10")
	private Integer id;
	@Size(min=5,max=20, message = "Name size must be min 5 and max 20")
	private String name;
	private Integer price;
	private String brand;
	private String category;
	@Min(value=1000, message="R.N start with 1000")
	private Integer registration_number;
	private String manufacturer_id;
	private String manufacturring_date;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(@Min(value = 10, message = "Id should start with 10") Integer id,
			@Size(min = 5, max = 20, message = "Name size must be min 5 and max 20") String name, Integer price,
			String brand, String category,
			@Min(value = 1000, message = "R.N start with 1000") Integer registration_number, String manufacturer_id,
			String manufacturring_date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.registration_number = registration_number;
		this.manufacturer_id = manufacturer_id;
		this.manufacturring_date = manufacturring_date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getRegistration_number() {
		return registration_number;
	}

	public void setRegistration_number(Integer registration_number) {
		this.registration_number = registration_number;
	}

	public String getManufacturer_id() {
		return manufacturer_id;
	}

	public void setManufacturer_id(String manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}

	public String getManufacturring_date() {
		return manufacturring_date;
	}

	public void setManufacturring_date(String manufacturring_date) {
		this.manufacturring_date = manufacturring_date;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", category="
				+ category + ", registration_number=" + registration_number + ", manufacturer_id=" + manufacturer_id
				+ ", manufacturring_date=" + manufacturring_date + "]";
	}
	
	
	
}
