package com.masai.usecase;

import java.util.List;



import com.masai.Emutil.Emutil;
import com.masai.Entity.CabOwner;

import jakarta.persistence.EntityManager;

public class getAllCabOwner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em= Emutil.provideEntityManager();
		
		String jpql= "from CabOwner";
		
		jakarta.persistence.Query q= em.createQuery(jpql);
		
		List<CabOwner> cabo= q.getResultList();
		
			
		System.out.println(cabo);
		
		
		System.out.println("done...");

	}

}
