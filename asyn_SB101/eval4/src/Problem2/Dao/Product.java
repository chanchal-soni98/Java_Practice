package Problem2.Dao;

import java.util.List;

public interface Product {
	
	public String addProduct(Product product) throws ProductException
	
	public List<Product> getAllProducts() throws ProductException
	
	public List<Product> getAllProductQuantityLessThan(int quantity)throws ProductException.
	
	 public String addProductQuantity(int productId, int Quantity)throws ProductException
	 
	 public String deleteProductByProductName(String pname)throws ProductException
	 
	 public Product getProductByProductName(String pname)throws ProductException
	 
	 public deleteProductWhoseNameStart(String name)throws ProductException

}
