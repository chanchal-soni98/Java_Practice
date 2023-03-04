package com.masai.Utility;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Entity.Employee;
import com.masai.Exception.EmployeeException;

public class RegisterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		Employee e = new Employee();
		e.setName("Chanchal");
		e.setAddress("Delhi");
		e.setSalary(50);
		
		try {
			if(dao.registerEmployee(e)!=null) {
				System.out.println(dao.registerEmployee(e));
			}
		} catch (EmployeeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
