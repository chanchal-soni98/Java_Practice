package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.StudentException;
import com.masai.model.Address;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class MyController {
	@Autowired
	private StudentService ss;
	
	  @GetMapping("/students")
	    public ResponseEntity<List<Student>> getallEmployees() throws StudentException{
	    	List<Student> add =ss.getAllStudentDetails();
	    	
	    	return new ResponseEntity<>(add,HttpStatus.OK);
	    }

	    
	    @GetMapping("/students/a")
	    public ResponseEntity<List<Student>> gettheEmployeebyAddress(@Valid @RequestBody Address address) throws StudentException{
	    	List<Student> st =ss.getStudentDetailsByAddress(address);
	    	
	    	
	    	return new ResponseEntity<>(st,HttpStatus.OK);
	    }
	    

	    @PutMapping("/students/{id}/a")
	    public ResponseEntity<Student> updateAddress(@Valid @PathVariable("id") Integer id,@RequestBody Address address) throws StudentException{
	    	Student add=ss.updateStudentAddress(id, address);
	    	
	    	return new ResponseEntity<>(add,HttpStatus.OK);
	    }
	    
	    @GetMapping("/employee/dto")
	    public ResponseEntity<List<StudentDTO>> getDTO() throws StudentException{
	    	List<StudentDTO> add=ss.getNameAddressAgeOfAllStudents();
	    	
	    	
	    	return new ResponseEntity<>(add,HttpStatus.OK);
	    }
	    @GetMapping("/students/sAge/{sAge}/eAge/{eAge}")
	    public ResponseEntity<List<Student>> getStudentAgeBetween(@PathVariable("sAge") Integer sAge,@PathVariable("eAge") Integer eAge) throws StudentException{
	    	List<Student> add = ss.getStudentsBetweenAge(sAge, eAge);
	    	
	    	
	    	return new ResponseEntity<>(add,HttpStatus.OK);
	    }
	

}
