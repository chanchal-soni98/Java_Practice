package com.masai.Dao;

import com.masai.Beans.Doctor;
import com.masai.Beans.Patient;

public interface HospitalDAO {
	
	public void addDoctor(Doctor doctor);
	public Doctor getDoctor(int doctorId);
	public void registerPatient(Patient patient, int id);
	public Patient getPatient(int patientId);
	public void registerPatientWithDiffDoctor(int PatientId, int doctorId); 
	

}
