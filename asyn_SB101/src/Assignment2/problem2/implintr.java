package Assignment2.problem2;

public class implintr implements intr {

	@Override
	public void printDetail(Student student) {

		System.out.println(student.id+" "+student.name+" "+student.marks);
		
	}

}
