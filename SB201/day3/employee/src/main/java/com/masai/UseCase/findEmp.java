package com.masai.UseCase;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class findEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empId");
		int id = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		if(dao.getAddressOfEmployee(id) != null) {
			System.out.println(dao.getAddressOfEmployee(id));
		}else {
			System.out.println("Not fount");
		}
	}

}
