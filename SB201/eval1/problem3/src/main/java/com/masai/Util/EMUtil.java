package com.masai.Util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
//	
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookUnit");
//	
//	EntityManager em = emf.createEntityManager();
//	
	
	private static EntityManagerFactory emf;

    static{
        emf = Persistence.createEntityManagerFactory("bookUnit");
    }

    public static EntityManager provideEntityManager(){

        return emf.createEntityManager();
    }

}
