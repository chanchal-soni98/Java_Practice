package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;

@RestController
@RequestMapping("/app")
public class MyController {
//	part1
	@PostMapping("/employee")
	public Employee createEmp(@RequestBody Employee e) {
//		Employee e = new Employee(1,"soni","9876543216","soni@gmail.com",34);
		
		return e;

	
	}
//	part2

	@PostMapping("/employees")
	public List<Employee> generateEmp(@RequestBody List<Employee> emp){
		
//		List<Employee> emps = new ArrayList<>();
//		
//		emps.add(e);
		return emp;
//		emps.add(new Employee(1,"soni","9876543216","soni@gmail.com",34));
//		emps.add(new Employee(2,"soni2","9876543216","soni2@gmail.com",364));
//		emps.add(new Employee(3,"soni3","6876543216","soni3@gmail.com",634));
//		emps.add(new Employee(4,"soni4","9876543216","soni4@gmail.com",3644));
//		emps.add(new Employee(5,"soni5","6876543216","soni5@gmail.com",6394));
//		
//		return emps;
	}
	List<Employee> emps = new ArrayList<>();
	@PostMapping("/addEmp")
	public List<Employee> generateEmp(@RequestBody Employee emp){
		
//		List<Employee> emps = new ArrayList<>();
//		
		emps.add(emp);
		return emps;
	}
	
	
	@PostMapping("/hello")
	public String sayHello(@RequestBody String s) {
		return s;
	}	
	
	
//	Part3 Put
//	@PutMapping(value="/employee/{empId}")
//	public Employee updateSalary(@RequestBody Employee emp, @PathVariable("empId") Integer empId) {
//		emp.setSalary(emp.getSalary()+1000);
//		emp.setEmpId(empId);
//		return emp;
//	}
	@PutMapping(value = "/updateEmployee/{empId}")
	public Employee updateStudentDetail(@RequestBody Employee employee,@PathVariable("empId") Integer empId) {
		
		employee.setSalary(employee.getSalary()+1000);
		employee.setEmpId(empId);
		
		return employee;
	}
	
//	@PutMapping(value = "/updateEmployeeSal/{bounsSalarys}")
//	public Employee updateStudentDetails(@RequestBody Employee employee,@PathVariable("bounsSalarys")int salary) {
//		
//		employee.setSalary(employee.getSalary() + employee.getSalary()*salary/100);
//		
//		return employee;
//	}
	
//	Part4 Delete
	@DeleteMapping("/employee/{empId}")
	public String deleteEmpHandler(@PathVariable Integer empId) {
		
		return "Employee deleted sucessfully with Id ..."+empId;
	}
	
}
