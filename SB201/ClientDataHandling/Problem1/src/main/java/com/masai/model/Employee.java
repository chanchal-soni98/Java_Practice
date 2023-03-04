package com.masai.model;

import java.time.LocalDate;

import org.hibernate.validator.constraints.CreditCardNumber;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Employee {
	
	@Min(value=100, message="empId should be start with 100")
	private Integer empId;
	@Size(min=2,max=40,message="Name size error")
	@NotBlank(message="name can't be blank")
	@NotNull(message="name can't be null")
	private String empName;
	@Past
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dob;
	@Size(min=10,max=10)
	private String mob;
	@Email
	private String email;
	
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	@Pattern(regexp="^[A-Z][a-z][0-9]*")
	@NotBlank(message="password cant't be null")
	@NotNull(message="password can't be null")
	private String password;
	@CreditCardNumber
	private String CreditCardNo;
	
	@JsonIgnore
	@Size(min=3,max=3)
	private int cvv;
	private int salary;
	
	

	

	public Employee(@Min(value = 100, message = "empId should be start with 100") Integer empId,
			@Size(min = 2, max = 40, message = "Name size error") @NotBlank(message = "name can't be blank") @NotNull(message = "name can't be null") String empName,
			@Past LocalDate dob, @Size(min = 10, max = 10) String mob, @Email String email,
			@Pattern(regexp = "^[A-Z][a-z][0-9]*") @NotBlank(message = "password cant't be null") @NotNull(message = "password can't be null") String password,
			@CreditCardNumber String creditCardNo, @Size(min = 3, max = 3) int cvv, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.mob = mob;
		this.email = email;
		this.password = password;
		CreditCardNo = creditCardNo;
		this.cvv = cvv;
		this.salary = salary;
	}

	public Employee() {
		
		// TODO Auto-generated constructor stub
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreditCardNo() {
		return CreditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		CreditCardNo = creditCardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dob=" + dob + ", mob=" + mob + ", email="
				+ email + ", password=" + password + ", CreditCardNo=" + CreditCardNo + ", cvv=" + cvv + ", salary="
				+ salary + "]";
	}
	
	
	
	
}
