package com.masai.Utility;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;

public class GetEmployeeById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id number");
		int id =sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			if(dao.getEmployeeById(id)!=null) {
				System.out.println(dao.getEmployeeById(id));
			}else {
				System.out.println("Not found");
			}
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
