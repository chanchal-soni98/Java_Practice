package com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Emutil.Emutil;
import com.masai.Entity.Buyer;
import com.masai.Entity.Seller;
import com.masai.Entity.Store;

public class ShoppingDaoImpl implements ShoppingDao{

	@Override
	public void addStore(Store store) {
		
		EntityManager em=Emutil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(store);
		
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void registerBuyer(Buyer buyer, int store_id) throws StoreException {
		
		 EntityManager em=Emutil.provideEntityManager();
		 
		 Store st= em.find(Store.class, store_id);
		 
		 if(st==null) {
			 throw new  StoreException("Store not found");
			 
		 }
		 
		 st.getBuyers().add(buyer);
		 buyer.getStores().add(st);
		 
		 em.getTransaction().begin();
		 
		 em.merge(st);
		 em.merge(buyer);
		 
		 em.getTransaction().commit();
		 em.close();
		
	}

	@Override
	public void registerSeller(Seller seller) {
		 EntityManager em=Emutil.provideEntityManager();
		 
		 em.getTransaction().begin();
		 
		 em.persist(seller);
		 
		 em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void assignSellerWithStore(int seller_id, int store_id) throws SellerException, StoreException {
		   
		 EntityManager em=Emutil.provideEntityManager();
		 
		 Seller s=  em.find(Seller.class, seller_id);
		 if(s==null) {
			 throw new  SellerException("Seller not dound");
		 }
		 
		 Store st=em.find(Store.class, store_id);
		 if(st==null) {
			 throw new StoreException("Store not found");
		 }
		 
		 s.getStores().add(st);
		 st.setSeller(s);
		 
		 
		 em.getTransaction().begin();
		 
		 em.merge(s);
		 em.merge(st);
		 
		 em.getTransaction().commit();
		 em.clear();
		
	}

	@Override
	public List<Buyer> getAlltheBuyerByStoreName(String store_name) throws StoreException {
		    
		List<Buyer> li=null;
		
		EntityManager em=Emutil.provideEntityManager();
		
		Query  q=em.createQuery("from Store where store_name=:name");
		q.setParameter("name", store_name);
		
		Store s=(Store)q.getSingleResult();
		
		if(s==null) {
			throw new StoreException("Store not found");
		}
		
		 li= s.getBuyers();
		
		return li;
		
		  
	}

}

