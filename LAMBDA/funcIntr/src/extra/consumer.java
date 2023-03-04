package extra;

import java.util.function.Consumer;

import funcIntr.Student;

public class consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Student> c = s->{
			System.out.println("Roll is "+s.getRoll());
			System.out.println("Name is "+s.getName());
			System.out.println("Marks is "+s.getMarks());
			};
			c.accept(new Student(10,"Amit",850));
	}

}
