package com.masai.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.InvalidRollException;
import com.masai.model.Employee;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/app")
public class MyController {

//	part1
	
	@PostMapping("/employee")
	public Employee createNewEmp(@Valid @RequestBody Employee emp){
		return emp;
	}
//	part2
	@GetMapping("/employee")
	public Employee getEmp( ) {
		
		Employee emp = new Employee(1,"soniChelsi",LocalDate.now(),"223764579","chelsi@gmail.com","Soni@123","123456789123",123,7856);
		return emp;
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmpList() {
		List<Employee> emps = new ArrayList<>();
		Employee emp = new Employee(145,"soniChelsi",LocalDate.parse("12-03-1234"),"223764579","chelsi@gmail.com","Soni@123","123456789123",123,7856);
		emps.add(emp);
		return emps;
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to Spring Boot";
	}
	
//	part3
	@PutMapping("employee/{empId}")
	public Employee updateEmp(@PathVariable("empId") Integer empId, @RequestBody Employee e) {
		e.setSalary(e.getSalary()+1000);
		e.setEmpId(empId);
		
		return e;
	}cd 
	
//	part4
	@DeleteMapping("employee/{empId}")
	public String deleteEmp(@Valid @PathVariable("empId") Integer empId) {
		
	
		return "deleted "+empId;
		
	}
}
