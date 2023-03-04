package com.masai.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Employee.getAllEmployee",query = "select e.name from Employee e")
public class Employee {
	
	@Id
	private int empId;
	@Column(nullable=true)
	private String name;
	@Column(nullable=true)
	private String address;
	@Column(nullable=true)
	private int roll;
	
	public Employee(int empId, String name, String address, int roll) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.roll = roll;
	}
	
	public Employee() {
		
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", roll=" + roll + "]";
	}
	
	
	

}
