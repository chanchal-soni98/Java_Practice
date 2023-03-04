package eval4.com.masai.Problem1.Dao;

import eval4.com.masai.Problem1.Exception.Employee;

public interface EmployeeDao {
	
	public String registerEmployeeWithoutDeptId(Employee emp);
	
	public String assigningDeptToEmp(int deptId,int empId);
	
	public void employeePassword(String email, String password);
	
	public String loginEmployee(String emailId, String password);
}
