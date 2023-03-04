package problem1;

import java.util.function.Predicate;

public class res {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Product> p1 = p -> p.quantity <5 ;
		
		System.out.println(p1.test(new Product(1,"p1",456,4)));
		System.out.println(p1.test(new Product(2,"p",756,6)));

	}

}
