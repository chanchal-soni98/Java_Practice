package com.masai.Dao;

import com.masai.EMUtil.EMUtil;
import com.masai.Entity.Employee;

import jakarta.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao{

	
	public boolean save(Employee emp) {
		// TODO Auto-generated method stub
		boolean flag = false;
		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(emp);

		flag = true;
		em.getTransaction().commit();
		
		
		
		em.close();
		
		return flag;
	}

	
	public String getAddressOfEmployee(int empId) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class,empId);
		
		// TODO Auto-generated method stub
		return emp.getAddress();
	}

	
	public String giveBonusToEmployee(int empId, int bonus) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
