package extra;

import java.util.function.Supplier;

import funcIntr.Student;

public class supplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s = () -> "This is from Lambda Expression";
		System.out.println(s.get());
		Supplier<Student> s2 = () -> new Student(10,"Ram",850);
		System.out.println(s2.get().getName());
	}

}
