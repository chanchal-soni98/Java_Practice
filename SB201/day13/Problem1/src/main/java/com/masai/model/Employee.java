package com.masai.model;

public class Employee {
	
	private Integer empId;
	private String empName;
	private String mob;
	private String email;
	private Integer salary;
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer empId, String empName, String mob, String email, Integer salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.mob = mob;
		this.email = email;
		this.salary = salary;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getMob() {
		return mob;
	}


	public void setMob(String mob) {
		this.mob = mob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mob=" + mob + ", email=" + email + ", salary="
				+ salary + "]";
	}
	
	

}
