package com.masai.Dao;

import java.util.List;

import com.masai.Entity.Employee;
import com.masai.Entity.PaySlip;



public interface ProblemOneDao {
	public Employee createEmployee(Employee emp);
	public void createPayslip(PaySlip paySlip, int empId);
	public PaySlip getPayslipByMonth(String month);
	public PaySlip getPayslipByID(int paySlipId);
	public void createEmployeePaySlips(List<PaySlip> payslips, int empID);

}
