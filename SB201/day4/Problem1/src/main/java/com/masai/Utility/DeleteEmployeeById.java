package com.masai.Utility;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Entity.Employee;
import com.masai.Exception.EmployeeException;

public class DeleteEmployeeById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao = new EmployeeDaoImpl();

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter empid");
		int id=sc.nextInt();
		
		try {
			Employee e = dao.deleteEmployeeById(id);
			if(e!=null) {
				System.out.println(e);
			}else {
				System.out.println("Not available");
			}
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
