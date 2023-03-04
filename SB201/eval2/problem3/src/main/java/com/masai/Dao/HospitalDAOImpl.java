package com.masai.Dao;

import com.masai.Beans.Doctor;
import com.masai.Beans.Patient;
import com.masai.EMUtil.EMUtil;

import jakarta.persistence.EntityManager;

public class HospitalDAOImpl implements HospitalDAO{
	
//	static EntityManager em = EMUtil.provideEntityManager();

	@Override
	public void addDoctor(Doctor doctor) {
		
		EntityManager em = EMUtil.provideEntityManager();
		Patient p1 = new Patient();
		p1.setPatientName("p1");
		p1.getDoc().add(doctor);
		
		Patient p2 = new Patient();
		p2.setPatientName("p2");
		p2.getDoc().add(doctor);
	

		doctor.getPat().add(p1);
		doctor.getPat().add(p2);
		

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		
		em.persist(doctor);
		
		em.getTransaction().commit();
		em.close();

		
	}

	@Override
	public Doctor getDoctor(int doctorId) {
		EntityManager em = EMUtil.provideEntityManager();
		Doctor d = em.find(Doctor.class, doctorId);

		
		return d;
		
	}

	@Override
	public void registerPatient(Patient patient,int id) {
		EntityManager em = EMUtil.provideEntityManager();
		// TODO Auto-generated method stub
		Doctor d = em.find(Doctor.class, id);

		
		d.getPat().add(patient);

		em.getTransaction().begin();
		em.persist(d);
		em.persist(patient);
		em.getTransaction().commit();
		em.close();

		
	}

	@Override
	public Patient getPatient(int patientId) {
		EntityManager em = EMUtil.provideEntityManager();
		// TODO Auto-generated method stub
		Patient p = em.find(Patient.class, patientId);

		

		return p;
		
	}

	@Override
	public void registerPatientWithDiffDoctor(int PatientId, int doctorId) {
		EntityManager em = EMUtil.provideEntityManager();
		// TODO Auto-generated method stub
		
		Doctor d = em.find(Doctor.class, doctorId);

		

		Patient p = em.find(Patient.class, PatientId);

		


		d.getPat().add(p);
		p.getDoc().add(d);

		em.getTransaction().begin();
		em.persist(d);
		em.persist(p);
		em.close();

		
	}

}
