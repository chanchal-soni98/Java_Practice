package Assignment1.problem1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<Employee>();  
		
		Employee e1=new Employee(1,"Chanchal","Pratagarh", 1234);  
		Employee e2=new Employee(2,"e2","ad2", 1000);
		Employee e3=new Employee(3,"e3","ad3", 2000);
		Employee e4=new Employee(4,"e4","ad4", 3000);
		Employee e5=new Employee(5,"e5","ad5", 4000);
		Employee e6=new Employee(6,"e6","ad6", 5000);  
		Employee e7=new Employee(7,"e7","ad7", 6000);
		Employee e8=new Employee(8,"e8","ad8", 7000);
		Employee e9=new Employee(9,"e9","ad9", 8000);
		Employee e10=new Employee(10,"e10","ad10",9000);
		
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		
		for(Employee e: list) {
			System.out.println(e.empId+" "+e.name+" "+e.address+" "+e.salary);
			if(e.salary<5000) {
				System.out.println(e.empId+" "+e.name+" "+e.address+" "+ (e.salary+1000));
			}
		}
		
		

	}

}
