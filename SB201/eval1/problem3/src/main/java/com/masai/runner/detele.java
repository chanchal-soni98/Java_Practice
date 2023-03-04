package com.masai.runner;

import java.util.Scanner;

import com.masai.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class detele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		Book book = em.find(Book.class, id);
		
		if(book != null) {
			
		
			em.getTransaction().begin();	
			em.remove(book);
		
			em.getTransaction().commit();
			
			System.out.println("removed");
			}else 
				System.out.println("not available");
			
				em.close();
		

				

	}

}
