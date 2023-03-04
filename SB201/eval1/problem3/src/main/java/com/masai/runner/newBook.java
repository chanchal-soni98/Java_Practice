package com.masai.runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.masai.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class newBook {
	
	
public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("bookUnit");
		
		
		EntityManager em= emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id");
		int id = sc.nextInt();
		System.out.println("name");
		String name = sc.next();
		System.out.println("author");
		String a = sc.next();
		System.out.println("p");
		String p = sc.next();
		System.out.println("c");
		String c = sc.next();
		System.out.println("price");
		int price = sc.nextInt();
		System.out.println("page");
		int page = sc.nextInt();
		
		
		
		
		Book book= new Book(id,name,a,p,c,page,price,LocalDateTime.now());
		
		em.getTransaction().begin();
		
		em.persist(book);
		
		em.getTransaction().commit();
		
		
		System.out.println("new book done...");
			
		em.close();
		

	}

}

