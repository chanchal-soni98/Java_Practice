package extra;

import java.util.function.Predicate;

public class predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = i -> i>0;
		
		
		System.out.println(p.test(10));//true
		System.out.println(p.test(-10));//false
	}

}
