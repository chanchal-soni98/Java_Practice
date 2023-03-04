package com.masai.Dao;

public interface ShoppingDao {
	
	public void addStore(Store store);
	public void registerBuyer(Buyer buyer, store_id)throws StoreException;
	public registerSeller(Seller seller);
	public assignSellerWithStore(int seller_id, int store_id) throws SellerException, StoreException;
	public List<Person> getAlltheBuyerByStoreName(String store_name)throws StoreException;
}
