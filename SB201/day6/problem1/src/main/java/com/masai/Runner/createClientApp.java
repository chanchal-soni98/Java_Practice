package com.masai.Runner;

import com.masai.EMUtil.EMUtil;
import com.masai.Entity.Collage;
import com.masai.Entity.Student;

import jakarta.persistence.EntityManager;

public class createClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManager em = EMUtil.provideEntityManger();
		
		Collage clg1 = new Collage();
		
		clg1.setCollageName("Nirma");
		clg1.setCollageAddress("Ahmedabad");
		
		Collage clg2 = new Collage();
		
		clg2.setCollageName("DU");
		clg2.setCollageAddress("Delhi");
		
		Student s1 = new Student();
		s1.setStudentName("name1");
		s1.setMobileNumber("123456789");
		s1.setEmail("name1@COM");
		
		s1.setClg(clg1);
		
		Student s2 = new Student();
		s2.setStudentName("name2");
		s2.setMobileNumber("123456789");
		s2.setEmail("name2@COM");
		
		s2.setClg(clg2);
		
		
		clg1.getSts().add(s1);
		clg2.getSts().add(s2);
		
		em.getTransaction().begin();
		em.persist(clg1);
		em.persist(clg2);
		em.getTransaction().commit();
		
		System.out.println("done");

	}

}
