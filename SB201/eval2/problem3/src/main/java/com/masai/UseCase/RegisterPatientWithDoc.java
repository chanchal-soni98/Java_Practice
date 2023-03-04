package com.masai.UseCase;

import com.masai.Dao.HospitalDAO;
import com.masai.Dao.HospitalDAOImpl;
import com.masai.Exception.DoctorNot;
import com.masai.Exception.PatientNot;

public class RegisterPatientWithDoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalDAO dao = new HospitalDAOImpl();
		
		dao.registerPatientWithDiffDoctor(3, 1);
		
	}

}
