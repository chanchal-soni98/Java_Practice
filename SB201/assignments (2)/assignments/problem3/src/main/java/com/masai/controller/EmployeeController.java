package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService  empservice;

	  @PostMapping("/employee")
	  public ResponseEntity<Employee> RagisterEmployeeHandler(@Valid @RequestBody Employee emp) throws EmployeeException {
		
		     Employee e=empservice.registerEmployee(emp);
		     
		     return new ResponseEntity<Employee>(e,HttpStatus.CREATED);
	  }
	
	  @GetMapping("/employee/{id}")
	  public ResponseEntity<Employee> getEmpByIdHandler(@PathVariable("id") Integer id) throws EmployeeException{
		  
		  Employee e=empservice.getEmployeeById(id);
		     
		  return new ResponseEntity<Employee>(e,HttpStatus.OK);
		     
	  }
	  
	  @GetMapping("/employee")
	  public ResponseEntity<List<Employee>> getAllEmpHandler() throws EmployeeException{
		  
		  List<Employee> es=empservice.getAllEmployeeDetails();
		     
		  return new ResponseEntity<>(es,HttpStatus.OK);
		     
	  }
	
	  @DeleteMapping("/employee/{id}")
	  public ResponseEntity<Employee> DeleteEmpHandler(@PathVariable("id") Integer id) throws EmployeeException{
		  
		  Employee e=empservice.deleteEmployeeById(id);
		     
		  return new ResponseEntity<Employee>(e,HttpStatus.CREATED);
		     
	  }
	  
	  
	  @GetMapping("/employee/{id}/{pass}")
	  public ResponseEntity<Employee> LOginEmpHandler(@PathVariable("id") String email,@PathVariable("pass") String pass) throws EmployeeException{
		  
		  Employee e=empservice.loginEmployee(email,pass);
		     
		  return new ResponseEntity<Employee>(e,HttpStatus.CREATED);
		     
	  }
	  
	  @GetMapping("/employees/{add}")
	  public ResponseEntity<List<Employee>> getDetaulsByAddEmpHandler(@PathVariable("add")   String add) throws EmployeeException{
		  
		  List<Employee> es=empservice.getEmployeeDetailsByAddress(add);
		     
		  return new ResponseEntity<>(es,HttpStatus.OK);
		     
	  }
	  
	
	  @PutMapping("/employeeNameAdd/{id}")
	  public ResponseEntity<String> UpdateEmpHandler(@PathVariable("id") Integer id) throws EmployeeException{
		  
		  String e=empservice.getNameAndAddressOfEmplyeeById(id);
		     
		  return new ResponseEntity<>(e,HttpStatus.CREATED);
		     
	  }
	  
	  
	  @GetMapping("/employeesd")
	  public ResponseEntity<List<EmployeeDTO>> getDtoHandler() throws EmployeeException{
		  
		  List<EmployeeDTO> es=empservice.getNameAddressSalaryOfAllEmployee();
		     
		  return new ResponseEntity<>(es,HttpStatus.OK);
		     
	  }
	  
}
