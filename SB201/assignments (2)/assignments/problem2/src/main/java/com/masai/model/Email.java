package com.masai.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mail_id;
	private String email;
	@JsonFormat(pattern =  "dd/MM/yyyy")
	private LocalDate created_date;
	
	@OneToOne(mappedBy = "email")
	//@JsonProperty(access = Access.WRITE_ONLY)
	@JsonIgnore
	private User user;
	

	public Email(Integer mail_id, String email, LocalDate created_date, User user) {
		super();
		this.mail_id = mail_id;
		this.email = email;
		this.created_date = created_date;
		
		this.user = user;
	}

	public Email() {
		
	}
	
	@Override
	public String toString() {
		return "Email [mail_id=" + mail_id + ",  created_date=" + created_date + ", user=" + user
				+ "]";
	}

	public Integer getMail_id() {
		return mail_id;
	}

	public void setMail_id(Integer mail_id) {
		this.mail_id = mail_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
}
