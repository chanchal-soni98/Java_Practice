package com.masai.Usecase;

import com.masai.Dao.ShoppingDao;
import com.masai.Dao.ShoppingDaoImpl;
import com.masai.Entity.Store;

public class AddStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store s=new Store();
		s.setLocation("dhari");
		s.setStore_name("paradice mobile");
		
		ShoppingDao dao=new ShoppingDaoImpl();
		dao.addStore(s);
		System.out.println("Store added succes");

	}

}
