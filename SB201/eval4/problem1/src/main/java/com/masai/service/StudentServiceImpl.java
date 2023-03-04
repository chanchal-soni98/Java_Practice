package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.StudentException;
import com.masai.Repository.StudentRepo;
import com.masai.model.Address;
import com.masai.model.Student;
import com.masai.model.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepo sr;

	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
      List<Student> st = sr.findAll();
      if (st.size() == 0) {
          throw new StudentException("No Student details");
      }

      return st;
	}

	@Override
	public List<Student> getStudentDetailsByAddress(Address address) throws StudentException {
      List<Student> list= sr.findByAddress(address);
      if(list.isEmpty()) {
      	throw new StudentException("No Student found by this address");
      }
      return list;
	}

	@Override
	public Student updateStudentEmail(Integer studentId, String oldEmail, String newEmail) throws StudentException {
	  Student s= sr.findById(studentId)
			  .orElseThrow(() ->  new StudentException("Employeenot been found with  "+studentId));

      if(!s.getEmail().equals(oldEmail)) {
   	   throw new StudentException("Invalid password");
      }
      s.setEmail(newEmail);
      return sr.save(s);
	}

	@Override
	public Student updateStudentAddress(Integer studentId, Address address) throws StudentException {
		Student st=sr.findById(studentId)
				.orElseThrow(()-> new StudentException("Employee has not been found with "+studentId));
		st.setAddress(address);
    	return sr.save(st);
	}

	@Override
	public List<Student> getStudentsBetweenAge(Integer start_age, Integer end_age) throws StudentException {
    	List<Student> list = sr.findAll();
    	if(list.size()==0) {
    		throw new StudentException("Student is missing");
    	}
    	List<Student> l2 = new ArrayList<>();
    	
    	for(int i=0; i<list.size(); i++) {
    		if(list.get(i).getAge()>start_age && list.get(i).getAge()<end_age) {
    			l2.add(list.get(i));
    		}
    	}
    	return l2;
	}

	@Override
	public List<StudentDTO> getNameAddressAgeOfAllStudents() throws StudentException {
    	List<Student>list=sr.findAll();
    	if(list.size()==0) {
    		throw new StudentException("No student found in database");
    	}
    	List<StudentDTO> dtoList=new ArrayList<>();
    	
    	for(int i=0; i<list.size(); i++) {
    		StudentDTO dto=new StudentDTO();
    		dto.setName(list.get(i).getStudentName());
    		dto.setAddress(list.get(i).getAddress());
    		dto.setAge(list.get(i).getAge());
    		dtoList.add(dto);
    	}
    	return dtoList;
	}
	
}
