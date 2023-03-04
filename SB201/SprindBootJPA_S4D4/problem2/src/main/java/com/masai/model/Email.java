package com.masai.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
	

}
