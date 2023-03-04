package mainPack.Problem2;

import java.util.concurrent.Callable;

public class Student implements Callable<Object>{
	int roll;
	String name;
	String address;
	int marks;
	

	public Student(int roll, String name, String address, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}


	@Override
	public Object call() throws Exception {
		
		if(roll == 10) {
			return "Roll "+roll+" student is Fail";
		}else {
			return "Roll "+roll+" student is Pass";
		}
		// TODO Auto-generated method stub
//		return null;
	}

}
