package com.masai.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer id; 
	private String name;
	@Pattern(regexp =  "^[6-9][0-9]{9}")
	private String  phoneNo;
	@Past
	private LocalDate dateOfBirth;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Email email;

}
