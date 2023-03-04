package com.masai.UseCase;

import com.masai.Beans.Doctor;

import com.masai.Dao.HospitalDAO;
import com.masai.Dao.HospitalDAOImpl;

public class AddDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HospitalDAO dao = new HospitalDAOImpl();
		
		Doctor d = new Doctor();
		d.setLocation("Delhi");
		d.setName("Ram");
		d.setSpecialist("Ear");
	

		dao.addDoctor(d);
		


	}

}
