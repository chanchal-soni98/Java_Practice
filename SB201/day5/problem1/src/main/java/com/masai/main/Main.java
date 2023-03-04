package com.masai.main;

import com.masai.EMUtil.EMUtil;
import com.masai.Entity.Address;
import com.masai.Entity.Employee;

import jakarta.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a Main class to insert 4 Employee record inside the table, Each
//		Employee should have 2 addresses.
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		Employee emp = new Employee();
		emp.setName("Chanchal");
		emp.setSalary(234);
		emp.setGender("Female");
		emp.getEmpAddress().add(new Address("Raj","Jaipur","234567","Home"));
		emp.getEmpAddress().add(new Address("Mp","Indore","235567","Office"));
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		System.out.println("done");

	}

}
