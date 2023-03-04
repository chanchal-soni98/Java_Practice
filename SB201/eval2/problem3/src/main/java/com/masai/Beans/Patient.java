package com.masai.Beans;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Doctor> doc = new ArrayList<>();

	public Patient(int patientId, String patientName, List<Doctor> doc) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.doc = doc;
	}

	public Patient() {
		
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<Doctor> getDoc() {
		return doc;
	}

	public void setDoc(List<Doctor> doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", doc=" + doc + "]";
	}
	
	
	

}
