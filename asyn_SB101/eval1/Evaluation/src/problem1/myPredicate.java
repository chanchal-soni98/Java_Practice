package problem1;

import java.util.function.Predicate;

//Predicate<Product>: If the Product quantity is less than 5.
public class myPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		// TODO Auto-generated method stub
		return p.quantity < 5;
	}

}
