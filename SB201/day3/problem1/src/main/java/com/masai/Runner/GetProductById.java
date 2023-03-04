package com.masai.Runner;

import java.util.Scanner;

import com.masai.Entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GetProductById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("productUnit");
		
		EntityManager em = emf.createEntityManager();
//		EMUtil util = new EMUtil();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id..");
		int id = sc.nextInt();
		
		Product p = em.find(Product.class,id);
		
		if(p == null) {
			System.out.println("No product found.......");
		}else {
			System.out.println(p);
		}
		em.close();
	}


}