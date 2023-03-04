package com.masai.UseCase;

import com.masai.Beans.Patient;
import com.masai.Dao.HospitalDAO;
import com.masai.Dao.HospitalDAOImpl;
import com.masai.Exception.PatientNot;

public class GetPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalDAO dao = new HospitalDAOImpl();
		
		Patient patient = dao.getPatient(3);
		System.out.println(patient);

	}

}
