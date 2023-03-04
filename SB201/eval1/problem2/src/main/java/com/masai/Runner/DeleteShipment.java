package com.masai.Runner;

import java.util.Scanner;

import com.masai.Entity.Courier;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DeleteShipment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
EntityManagerFactory emf = Persistence.createEntityManagerFactory("courierUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		Courier c = em.find(Courier.class, id);
		
		if(c != null) {
			
		
			em.getTransaction().begin();	
			em.remove(c);
		
			em.getTransaction().commit();
			
			System.out.println("removed");
			}else 
				System.out.println("not available");
			
				em.close();
		

				

	}

}

