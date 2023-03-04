package com.masai.Emutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emutil {
	
	private static EntityManagerFactory emf;
    
    static {
  	  emf=Persistence.createEntityManagerFactory("problem2-unit");
    }
    
    public static EntityManager provideEntityManager() {
  	        return emf.createEntityManager();
    }
}
