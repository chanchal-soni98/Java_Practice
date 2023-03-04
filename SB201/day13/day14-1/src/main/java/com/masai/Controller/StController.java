package com.masai.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping
public class StController {
	
	private Map<Integer,Student> map =new HashMap<>();
	
	@PostConstruct
	public void init() {
		
		map.put(10, new Student(10,"soni",34));
		map.put(20, new Student(20,"soni1",54));
		map.put(30, new Student(30,"soni2",74));
		map.put(40, new Student(40,"soni3",24));
		
		
	}
	@GetMapping("/students")
	public List<Student> getStudent(){
		Collection<Student> student=  map.values();
		List<Student> st = new ArrayList<>(student);
		return st;
	}
	@PostMapping("/students")
	public String saveStudent(@RequestBody Student st) {
		
		map.put(st.getRoll(), st);
		
		return "Student stored Sucessfully ...!"+st;
		
	}
	@GetMapping("students/{roll}")
	public Student getStudentByName(@PathVariable("roll") Integer roll) {
		
		if(map.containsKey(roll)) {
			Student st = map.get(roll);
			return st;
		}else {
			throw new IllegalArgumentException("st's doesn't exist roll");
		}
	}
	
	@PutMapping("/students/{roll}")
	public String updateStudentMarks(@PathVariable("roll") Integer roll,@RequestBody Student st) {
		
		if(map.containsKey(roll)) {
			Student student =map.get(roll);
			map.put(roll, student);
			return "updated";
		}else {
			throw new IllegalArgumentException("st's doesn't exist roll");
		}
	}

}
