package com.masai.Dao;

import com.masai.Entity.Employee;

public interface EmployeeDao {
	public boolean save(Employee emp);
	public String getAddressOfEmployee(int empId);
	public String giveBonusToEmployee(int empId, int bonus);
	public boolean deleteEmployee(int empId);
}
