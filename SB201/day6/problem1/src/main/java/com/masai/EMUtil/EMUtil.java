package com.masai.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
	
	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("commonUnit");
	}
	
	public static EntityManager provideEntityManger() {
		return emf.createEntityManager();
	}

}
