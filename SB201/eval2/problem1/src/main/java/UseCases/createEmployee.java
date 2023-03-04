package UseCases;

import java.util.Scanner;

import com.masai.Dao.ProblemOneDao;
import com.masai.Dao.ProblemOneDaoImpl;
import com.masai.Entity.Employee;

public class createEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter email: ");
		String email = sc.next();
		
		System.out.println("Enter phone: ");
		String phone = sc.next();
		
		ProblemOneDao dao = new ProblemOneDaoImpl();
		
		Employee e = new Employee();
		
		e.setAge(age);
		e.setEmail(email);
		e.setName(name);
		e.setPhone(phone);
		
		
		
		System.out.println(dao.createEmployee(e));
	}

}
