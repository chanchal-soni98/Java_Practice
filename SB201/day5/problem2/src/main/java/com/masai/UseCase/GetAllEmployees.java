package com.masai.UseCase;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;

public class GetAllEmployees {

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		System.out.println(dao.getAllEmployees());
		
		
		System.out.println("done");

	}

}
