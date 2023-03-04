package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("from Employee where email=:em and password=:pass")
	  public Employee getEmployeeByCreadential(@Param("em") String mail,@Param("pass") String pass);
	
	public List<Employee> findByAddress(String add);
	
	@Query("select empName , address from Employee where empId=?1")
	public String getNameAndAddress(Integer empid);
	
	@Query("select new com.masai.model.EmployeeDTO(e.empName,e.address,e.salary) from Employee e")
	public List<EmployeeDTO> findalladdandsalaryofEmp();
}
