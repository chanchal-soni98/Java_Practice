package com.masai.runner;

import java.util.Scanner;

import com.masai.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id");
		int id = sc.nextInt();
	
		
		Book book = em.find(Book.class, id);
		
		if(book == null) {
			System.out.println("not available");
		}else {
			
		em.getTransaction().begin();
		
		
		
		book.setPrice(book.getPrice()*2);
		
		em.getTransaction().commit();
		}
		em.close();
		System.out.println("done");
		
	}
	

	}


