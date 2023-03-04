package eval4.com.masai.Problem1.useModel;

import java.util.Scanner;

import eval4.com.masai.Problem1.Dao.DepartmentDao;
import eval4.com.masai.Problem1.Dao.DepartmentImplDao;
import eval4.com.masai.Problem1.Exception.Department;

public class addDepartment {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department Id");
		int did = sc.nextInt();
				
		System.out.println("Enter department Name ");
		String name = sc.next();
		
		System.out.println("Enter department Location");
		String location = sc.next();
				
	    Department dep = new Department(did,name,location);
	    
	    DepartmentDao d = new DepartmentImplDao();	     
	    
	    System.out.println(d.addDepartment(dep));
	    	
	}
}