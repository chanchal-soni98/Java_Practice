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
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doctorId;
	private String name;
	private String specialist;
	private String location;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="doc_pat")
	private List<Patient>pat = new ArrayList<>();

	public Doctor(int doctorId, String name, String specialist, String location, List<Patient> pat) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.specialist = specialist;
		this.location = location;
		this.pat = pat;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Patient> getPat() {
		return pat;
	}

	public void setPat(List<Patient> pat) {
		this.pat = pat;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", name=" + name + ", specialist=" + specialist + ", location="
				+ location + ", pat=" + pat + "]";
	}
	
	

}
