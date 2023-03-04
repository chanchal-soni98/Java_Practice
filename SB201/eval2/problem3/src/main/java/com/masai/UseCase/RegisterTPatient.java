package com.masai.UseCase;

import com.masai.Beans.Patient;
import com.masai.Dao.HospitalDAO;
import com.masai.Dao.HospitalDAOImpl;
import com.masai.Exception.DoctorEx;

public class RegisterTPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HospitalDAO dao = new HospitalDAOImpl();
		
		Patient patient = new Patient();
		patient.setPatientName("Amit");
		dao.registerPatient(patient, 1);

	}

}
