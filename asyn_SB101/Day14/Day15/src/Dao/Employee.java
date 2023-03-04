package Dao;

import java.util.List;

import Exception.EmployeeException;

public interface Employee {
	
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployee();

	public boolean deleteEmployeeById(int empId) throws EmployeeException;

	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException;

}
