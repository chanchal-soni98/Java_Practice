package com.masai.Dao;


import com.masai.EMUtil.EMUtil;
import com.masai.Entity.Employee;
import com.masai.Exception.EmployeeException;

import jakarta.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		return emp;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		Employee e1=null;
		if(emp!=null) {
			em.getTransaction().begin();
			em.remove(emp);
			 e1 = emp;
			 em.getTransaction().commit();
			
		}
		em.close();
		return e1;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = em.find(Employee.class, employee.getEmpId());
		
		if(emp!=null) {
			em.getTransaction().begin();
			em.merge(employee);
			em.getTransaction().commit();
		}
		em.close();
		return employee;
	}

}
