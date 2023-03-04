package com.masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

@RestController//controller+responebody
public class StudentController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "welcome to SB";
	}
	
	@RequestMapping("/getstudent")
	public Student getStudentHandler() {
		
		Student s1 = new Student(10,"Soni",500);
		return s1;
	}
	@RequestMapping("/studentList")
	public List<Student> StudentHandler(){
		
		List<Student> s = new ArrayList<>();
		s.add(new Student(11,"Soni1",4500));
		s.add(new Student(12,"Soni2",5020));
		return s;
		
	}
}
