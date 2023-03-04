package com.masai.Utility;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Entity.Employee;
import com.masai.Exception.EmployeeException;

public class UpdateEmployee {

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter empid");
		int id=sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		
		Employee e = dao.getEmployeeById(id);
		
		if(e==null) {
			System.out.println("Not available");
		}else {
			
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter address");
			String address = sc.next();
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			
			e.setName(name);
			e.setAddress(address);
			e.setSalary(salary);
			
			dao.updateEmployee(e);
		}

	}

}


