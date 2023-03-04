package funcIntr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> sts = new ArrayList<>();
		
		sts.add(new Student(1,"Akhi",234));
		sts.add(new Student(2,"Chelsi",454));
		sts.add(new Student(3,"Lalita",784));
		sts.add(new Student(4,"Mansukh",484));
		sts.add(new Student(5,"Neetu",453));
		
		Collections.sort(sts,(s1,s2)-> s1.getMarks()<s2.getMarks()? 1 : -1);
		
		System.out.println(sts);

	}

}
