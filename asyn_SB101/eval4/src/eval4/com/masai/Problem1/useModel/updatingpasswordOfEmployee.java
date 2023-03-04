package eval4.com.masai.Problem1.useModel;

import java.util.Scanner;

import eval4.com.masai.Problem1.Dao.EmployeeDao;
import eval4.com.masai.Problem1.Dao.EmployeeImplDao;

public class updatingpasswordOfEmployee {
	
public static void main(String[] args) {
		
		EmployeeDao edao = new EmployeeImplDao();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Id");
		String empId = sc.next();
		
		
		System.out.println("Enter New Password");
		String password = sc.next();
		
		
				
		edao.employeePassword(empId, password);
	}

}
