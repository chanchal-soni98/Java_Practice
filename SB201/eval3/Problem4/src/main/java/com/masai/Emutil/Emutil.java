package com.masai.Emutil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Emutil {
	
	private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("commonUnit");
	}
	
	public static EntityManager provideEntityManager(){
	
		return emf.createEntityManager();
	}

}
