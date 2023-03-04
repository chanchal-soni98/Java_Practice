package eval4.com.masai.Problem1.useModel;

import java.util.Scanner;

import eval4.com.masai.Problem1.Dao.EmployeeDao;
import eval4.com.masai.Problem1.Dao.EmployeeImplDao;

public class AssigningDeptToEmp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee id");
		int emplId = sc.nextInt();
		
		System.out.println("Enter departmentId id");
		int deptId = sc.nextInt();	
				
		EmployeeDao e = new EmployeeImplDao();
		
		String msg = e.assigningDeptToEmp(deptId, emplId);
		
		System.out.println(msg);
		
		
	}
}
