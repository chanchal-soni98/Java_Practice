package com.masai.Runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.masai.Entity.Courier;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CreateShipment {

public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("courierUnit");
		
		
		EntityManager em= emf.createEntityManager();
		
		
		Courier c= new Courier(101,"bd3","veg",4.5,"dgkh","ybrfbvs", LocalDateTime.now());
		
		
		em.getTransaction().begin();
		
		em.persist(c);
		
		em.getTransaction().commit();
		
		System.out.println("Courier done...");
		
		em.close();
		

	}

}

