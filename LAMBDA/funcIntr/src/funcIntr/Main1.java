package funcIntr;

public class Main1 {

	public static void main(String[] args) {

		Intr1 i1 = (n1,n2)->{
			System.out.println(n1+n2);
		};
		
		i1.add(10, 40);
		
		Intr2 i2 = (n1,n2)->{
			return n1*n2;
		};
		
		System.out.println(i2.add(50,60));
	
		
		Intr3 i3 = (s) ->{
			System.out.println("Roll :"+s.getRoll());
			System.out.println("Name :"+s.getName());
			System.out.println("Marks :"+s.getMarks());
		};
		i3.printDetails(new Student(1,"Chelsi",78));
	
	}	

}
