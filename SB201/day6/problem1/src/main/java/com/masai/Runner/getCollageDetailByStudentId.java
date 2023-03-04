package com.masai.Runner;

import java.util.Scanner;

import com.masai.EMUtil.EMUtil;
import com.masai.Entity.Collage;
import com.masai.Entity.Student;

import jakarta.persistence.EntityManager;

public class getCollageDetailByStudentId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtil.provideEntityManger();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ender student id: ");
		int id = sc.nextInt();
		
		Student s = em.find(Student.class, id);
		
		Collage c = s.getClg();
		
		
		System.out.println(c.getCollageId());
		System.out.println(c.getCollageName());
		System.out.println(c.getCollageAddress());

	}

}
