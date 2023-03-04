package com.masai.service;

import java.util.List;

import com.masai.Exception.StudentException;
import com.masai.model.Address;
import com.masai.model.Student;
import com.masai.model.StudentDTO;

public interface StudentService {
	
	public List<Student> getAllStudentDetails()throws StudentException; 

	public List<Student> getStudentDetailsByAddress(Address address)throws StudentException;

	public Student updateStudentEmail(Integer studentId, String oldEmail,String newEmail)throws StudentException ; 

	public Student updateStudentAddress(Integer studentId, Address address)throws StudentException;

	public List<Student> getStudentsBetweenAge(Integer start_age, Integer end_age)throws StudentException;

	public List<StudentDTO> getNameAddressAgeOfAllStudents()throws StudentException; 
	

}
