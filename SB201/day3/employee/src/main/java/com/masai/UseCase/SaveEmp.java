package com.masai.UseCase;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Entity.Employee;

public class SaveEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		Employee e1 = new Employee(1,"chanchal","delhi",354);
		

		
		if(dao.save(e1)) {
			System.out.println("Added");
		}else {
			System.out.println("Can't Added");
		}
	}

}
