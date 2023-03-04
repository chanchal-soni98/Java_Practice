package com.masai.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.Id;
@Entity
public class PaySlip {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paySlipId;
	@Enumerated(EnumType.STRING)
	private Month month;
	private int salary;
	private LocalDateTime createdAt;
	
	
	
	public PaySlip() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PaySlip(int paySlipId, Month month, int salary, LocalDateTime createdAt) {
		super();
		this.paySlipId = paySlipId;
		this.month = month;
		this.salary = salary;
		this.createdAt = createdAt;
	}


	public int getPaySlipId() {
		return paySlipId;
	}
	public void setPaySlipId(int paySlipId) {
		this.paySlipId = paySlipId;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	@Override
	public String toString() {
		return "PaySlip [paySlipId=" + paySlipId + ", month=" + month + ", salary=" + salary + ", createdAt="
				+ createdAt + "]";
	}
	
	

}
