package com.masai.Runner;

import java.util.Scanner;

import com.masai.Entity.Courier;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UpdateShipment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id");
		int id = sc.nextInt();
	
		
		Courier c = em.find(Courier.class, id);
		
		if(c == null) {
			System.out.println("not available");
		}else {
			
		em.getTransaction().begin();
		
		String content =sc.next();
		float weight = sc.nextFloat();
		String ra = sc.next();
		
		c.setContent(content);
		c.setWeight(weight);
		c.setRecipientAddress(ra);
		
		em.getTransaction().commit();
		}
		em.close();
		System.out.println("done");
		
	}
	

	}

