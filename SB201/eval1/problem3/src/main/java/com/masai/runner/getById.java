package com.masai.runner;

import java.util.Scanner;

import com.masai.Util.EMUtil;
import com.masai.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class getById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookUnit");
		
		EntityManager em = emf.createEntityManager();
//		EMUtil util = new EMUtil();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		
		Book book = em.find(Book.class,id);
		
		if(book == null) {
			System.out.println("No book found.......");
		}else {
			System.out.println(book);
		}
	}

}
