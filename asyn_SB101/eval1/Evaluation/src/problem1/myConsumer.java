package problem1;

import java.util.function.Consumer;
//Consumer<Product>: Print the Product's details.
public class myConsumer  {
   
	public static void main(String[] args) {
		
		Product product = new Product(3,"p3",678,8);
		
		Consumer<Product> p2 = p1->{
			System.out.println(p1.productId);
			System.out.println(p1.productName);
			System.out.println(p1.price);
			System.out.println(p1.quantity);
			
		};
		
		p2.accept(product);
		
	}

	



}
