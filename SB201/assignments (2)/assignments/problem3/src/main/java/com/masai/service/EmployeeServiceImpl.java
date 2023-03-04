package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		 
		 Employee em= emprepo.save(emp);
		 if(em==null) {
			 throw new EmployeeException("Oppps Something problem  !!!");
		 }
		   return  em;
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		  
		  return emprepo.findById(empId).orElseThrow(()->new EmployeeException("Not Found"));
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		
		List<Employee> lis=emprepo.findAll();
		
		if(lis.isEmpty()) {
			throw new EmployeeException("Employee not found ");
		}
		
		return lis;
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		   
		 Employee emp=getEmployeeById(empId);
		 
		 emprepo.delete(emp);
		 
		 return emp;
	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		  
		 Employee emp=emprepo.getEmployeeByCreadential(email, password);
		 
		 if(emp==null) {
			 throw new EmployeeException("No Employee Found with this username and password");
		 }

		 return emp;
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		
		  List<Employee> emps=emprepo.findByAddress(address);
		  
		  if(emps.isEmpty()) {
			  throw new EmployeeException("No employee found with address "+address);
		  }
		  
		  return emps;
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		  
		emprepo.findById(emp.getEmpId()).orElseThrow(()->new EmployeeException("Employee not found "+emp ));
		
		return emprepo.save(emp);
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		 String str=emprepo.getNameAndAddress(empId);
		 if(str==null) {
			 throw new EmployeeException("Employee not found with id "+empId);
		 }
		 
		 return str;
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		  List<EmployeeDTO>  emdto=emprepo.findalladdandsalaryofEmp();
		  
		  if(emdto.isEmpty()) {
			  throw new EmployeeException("Not Found");
		  }
		  return emdto;
	}

}
