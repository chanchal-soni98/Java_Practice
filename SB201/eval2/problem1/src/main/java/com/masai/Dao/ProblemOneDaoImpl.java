package com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtil.EMUtil;
import com.masai.Entity.Employee;
import com.masai.Entity.PaySlip;


public class ProblemOneDaoImpl implements ProblemOneDao{

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		Employee employee = em.merge(emp);
		em.getTransaction().commit();
		
		em.close();
		return employee;
	}

	@Override
	public void createPayslip(PaySlip paySlip, int empId) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		em.getTransaction().begin();
		PaySlip p  = em.merge(paySlip);
		em.getTransaction().commit();
		
		System.out.println(p);
		em.close();
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public PaySlip getPayslipByMonth(String month) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "select s from payslip where month = :m ";
		
		Query q = em.createQuery(jpql);
		
		q.setParameter("m", month);
		
		PaySlip s = (PaySlip) q.getSingleResult();
		
		em.close();
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public PaySlip getPayslipByID(int paySlipId) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
        String jpql = "select s from payslip where month = :id ";
		
		Query q = em.createQuery(jpql);
		
		q.setParameter("is", paySlipId);
		
		PaySlip s = (PaySlip) q.getSingleResult();
		
		em.close();
		
		
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public void createEmployeePaySlips(List<PaySlip> payslips, int empID) {
		
		EntityManager em = EMUtil.provideEntityManager();
		// TODO Auto-generated method stub
		
	}

}
