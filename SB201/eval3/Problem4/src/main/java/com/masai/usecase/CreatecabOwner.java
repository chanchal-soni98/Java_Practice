package com.masai.usecase;

import com.masai.Emutil.Emutil;
import com.masai.Entity.Cab;
import com.masai.Entity.CabOwner;

import jakarta.persistence.EntityManager;

public class CreatecabOwner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em= Emutil.provideEntityManager();
		CabOwner co = new CabOwner();
		co.setOwnerName("ramu");
		co.setPhoneNumber("23648565");
		co.setEmailid("gmail.com");
		co.setCab(new Cab(1,"red","123456"));
		
		em.getTransaction().begin();
		em.persist(co);
		em.getTransaction().commit();
		
		System.out.println("done");
		

	}

}
