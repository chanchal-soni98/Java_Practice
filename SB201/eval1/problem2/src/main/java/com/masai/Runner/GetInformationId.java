package com.masai.Runner;

import java.util.Scanner;

import com.masai.Entity.Courier;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GetInformationId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("courierUnit");
		
		EntityManager em = emf.createEntityManager();
//		EMUtil util = new EMUtil();
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		
		Courier c = em.find(Courier.class,id);
		
		if(c == null) {
			System.out.println("No courier found.......");
		}else {
			System.out.println(c);
		}
		em.close();
	}


	}

