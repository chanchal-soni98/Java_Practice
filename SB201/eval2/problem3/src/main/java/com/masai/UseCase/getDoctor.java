package com.masai.UseCase;

import com.masai.Beans.Doctor;
import com.masai.Dao.HospitalDAO;
import com.masai.Dao.HospitalDAOImpl;
import com.masai.Exception.DoctorNot;

public class getDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HospitalDAO dao = new HospitalDAOImpl();
		Doctor doctor = dao.getDoctor(11);
		System.out.println(doctor);

	}

}
