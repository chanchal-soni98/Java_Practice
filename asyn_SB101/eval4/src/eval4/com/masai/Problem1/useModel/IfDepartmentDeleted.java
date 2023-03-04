package eval4.com.masai.Problem1.useModel;

import java.util.Scanner;

import eval4.com.masai.Problem1.Dao.DepartmentDao;
import eval4.com.masai.Problem1.Dao.DepartmentImplDao;

public class IfDepartmentDeleted {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department  id");
		int deptId = sc.nextInt();		
				
		DepartmentDao dao = new DepartmentImplDao();
		
		dao.deleteDepartment(deptId);		
		
	}

}
