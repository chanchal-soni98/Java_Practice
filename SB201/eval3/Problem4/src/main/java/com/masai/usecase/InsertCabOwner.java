package com.masai.usecase;

import java.util.ArrayList;
import java.util.List;

import com.masai.Emutil.Emutil;
import com.masai.Entity.Cab;
import com.masai.Entity.CabOwner;

import jakarta.persistence.EntityManager;

public class InsertCabOwner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em=Emutil.provideEntityManager();
		
		CabOwner co = new CabOwner();
		co.setOwnerName("ramesh");
		co.setPhoneNumber("23648565");
		co.setEmailid("gmail1.com");
		co.setCab(new Cab(2,"yellow","123456"));
		
		CabOwner co1 = new CabOwner();
		co1.setOwnerName("ramak");
		co1.setPhoneNumber("23648565");
		co1.setEmailid("gmail3.com");
		co1.setCab(new Cab(3,"pink","123456"));
		
		CabOwner co2 = new CabOwner();
		co2.setOwnerName("raju");
		co2.setPhoneNumber("23648565");
		co2.setEmailid("gmail4.com");
		co2.setCab(new Cab(4,"black","123456"));
		
		CabOwner co3 = new CabOwner();
		co2.setOwnerName("chelsi");
		co2.setPhoneNumber("23648565");
		co2.setEmailid("gmail5.com");
		co2.setCab(new Cab(5,"ora","123456"));
		
		List<CabOwner> cabo = new ArrayList<>();
		em.getTransaction().begin();
		cabo.add(co);
		cabo.add(co1);
		cabo.add(co2);
		cabo.add(co3);
		
		em.getTransaction().commit();
		System.out.println(cabo);
		System.out.println("done...");

	}

}
