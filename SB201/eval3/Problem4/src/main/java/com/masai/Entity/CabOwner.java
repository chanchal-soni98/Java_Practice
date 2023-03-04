package com.masai.Entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CabOwner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ownerId;
	private String ownerName;
	private String phoneNumber;
	private String emailid ;
	
	@Embedded
	private Cab cab;

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public CabOwner(int ownerId, String ownerName, String phoneNumber, String emailid, Cab cab) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.phoneNumber = phoneNumber;
		this.emailid = emailid;
		this.cab = cab;
	}

	public CabOwner() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CabOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", phoneNumber=" + phoneNumber
				+ ", emailid=" + emailid + ", cab=" + cab + "]";
	}
	
	
	

}
