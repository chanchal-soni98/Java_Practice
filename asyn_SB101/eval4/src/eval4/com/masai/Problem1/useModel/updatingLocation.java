package eval4.com.masai.Problem1.useModel;

import java.util.Scanner;

import eval4.com.masai.Problem1.Dao.DepartmentDao;
import eval4.com.masai.Problem1.Dao.DepartmentImplDao;

public class updatingLocation {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Department Id");
	

	
	int did = sc.nextInt();
	
	
	System.out.println("Enter New Department Location");
	String location = sc.next();
	
	
	DepartmentDao ddao = new DepartmentImplDao();
	
	String message = ddao.updateDepartmentLocation(did, location);
	
	System.out.println(message);	
	
	
      }

}
