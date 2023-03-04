package eval4.com.masai.Problem1.useModel;

import java.util.Scanner;

import eval4.com.masai.Problem1.Dao.EmployeeDao;
import eval4.com.masai.Problem1.Dao.EmployeeImplDao;
import eval4.com.masai.Problem1.Exception.Employee;

public class registerEmployeeWithoutDeptId {
	
public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp Id");
		int empId = sc.nextInt();
		
		System.out.println("Enter emp Name ");
		String ename = sc.next();
		
		System.out.println("Enter emp Address");
		String address = sc.next();
		
		System.out.println("Enter emp email");
		String email = sc.next();
		
		System.out.println("Enter emp Password");
		String password = sc.next();
		
		System.out.println("Enter emp salary");
		int salary = sc.nextInt();
		
		System.out.println("Enter emp department Id");
		int deptId = sc.nextInt();
		
		Employee emp = new Employee(empId, ename, address, email, password, salary,deptId);
		EmployeeDao d = new EmployeeImplDao();  
 
	    System.out.println(d.registerEmployeeWithoutDeptId(emp));    
		
	   }

}
