package eval4.com.masai.Problem1.useModel;

import java.util.Scanner;

import eval4.com.masai.Problem1.Dao.EmployeeDao;
import eval4.com.masai.Problem1.Dao.EmployeeImplDao;

public class LogInEmployee {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter Employee Email ");
	    String email = sc.next();
	    
	    
	    System.out.println("Enter password");
	    String password = sc.next();
	    
	    EmployeeDao dao = new EmployeeImplDao();
	    
	    String result  = dao.loginEmployee(email, password);
	    
	    
	    System.out.println(result);
	    }
}
