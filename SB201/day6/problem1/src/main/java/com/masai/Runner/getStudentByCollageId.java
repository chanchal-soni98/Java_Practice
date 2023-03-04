package com.masai.Runner;

import java.util.List;
import java.util.Scanner;

import com.masai.EMUtil.EMUtil;
import com.masai.Entity.Collage;
import com.masai.Entity.Student;

import jakarta.persistence.EntityManager;

public class getStudentByCollageId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtil.provideEntityManger();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("clgId: ");
		int id = sc.nextInt();
		Collage c = em.find(Collage.class, id);
		
		List<Student> s = c.getSts();
		
		s.forEach(si->{
			System.out.println(si.getStudentRoll());
			System.out.println(si.getStudentName());
			System.out.println(si.getMobileNumber());
			System.out.println(si.getEmail());
			
		});

	}

}
