package com.masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Exception.StudentException;
import com.masai.model.Address;
import com.masai.model.Student;
import com.masai.model.StudentDTO;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	public List<Student> findByAddress(Address address)throws StudentException;
	

//	public Student updateStudentEmail(Integer studentId, String oldEmail,String newEmail)throws StudentException ; 
//			
//
//	public Student updateStudentAddress(Integer studentId, Address address)throws StudentException;
//	
//
//	public List<Student> getStudentsBetweenAge(Integer start_age, Integer end_age)throws StudentException;
//	     
public List<StudentDTO> findByNameAndAddressAndAgeOfAllStudents()throws StudentException; 


}
