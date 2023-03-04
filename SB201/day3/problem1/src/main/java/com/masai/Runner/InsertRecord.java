package com.masai.Runner;

import java.util.Scanner;

import com.masai.Entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("productUnit");
		
		EntityManager em= emf.createEntityManager();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter quantity");
		int quantity = sc.nextInt();
		System.out.println("Enter price");
		int price = sc.nextInt();
		
		Product p= new Product(id,name,quantity,price);
		
		
		em.getTransaction().begin();
		
		em.persist(p); 
		
		em.getTransaction().commit();
		
		System.out.println("Product inserted done...");
		
		em.close();

	}

}
