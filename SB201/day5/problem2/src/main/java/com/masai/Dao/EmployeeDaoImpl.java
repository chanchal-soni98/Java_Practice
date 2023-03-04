package com.masai.Dao;

import java.util.List;

import com.masai.EMUtil.EMUtil;
import com.masai.Entity.Employee;
import com.masai.Exception.EmployeeException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Query q = em.createNamedQuery("Employee.getAllEmployee", Employee.class);
		// TODO Auto-generated method stub
		
		List<Employee>list = q.getResultList();
//		list.forEach(e->System.out.println(e));
		return list;
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "select e.name from employee e where e.address = address";
		
		Query q = em.createQuery(jpql);
		
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		return null;
	}

	@Override
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
		// TODO Auto-generated method stub
		return 0;
	}

}
