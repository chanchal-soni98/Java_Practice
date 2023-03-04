package mainPack.Problem2;

import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class Student implements Callable {
	int roll;
	String name;
	int marks;
	
	

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}



	@Override
	public Object call() throws Exception {

		if(marks>500) {
			return "Pass";
		}else {
			return "Fail";
		}
	}
	

}
