package funcIntr;

public class Student {
	
	private int Roll;
	private String Name;
	private int marks;
	
	public Student() {
//		 TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int marks) {
		
		Roll = roll;
		Name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int roll) {
		Roll = roll;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [Roll=" + Roll + ", Name=" + Name + ", marks=" + marks + "]";
	}
	
	
	
	

}
