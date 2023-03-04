package com.masai.model;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Student {
	@NotNull
	@NotBlank
	@NotEmpty
	private Integer studentId;
	@NotNull
	@NotBlank
	@NotEmpty
	@Size(min=3,max=10, message="Student name should be min 3 and max 10 character length. ")
	private String studentName;
	@NotNull
	@NotBlank
	@NotEmpty
	@Embedded
	private Address address;
	@NotNull
	@NotBlank
	@NotEmpty
	@Min(value=12, message="Student age should be greater than 12")
	private Integer age;
	@NotNull
	@NotBlank
	@NotEmpty
	@Email(message="Email should be in proper format and it should be unique.")
	private String email;
	@NotNull
	@NotBlank
	@NotEmpty
	@Size(min=10,max=10)
	private String mobile;
	@NotNull
	@NotBlank
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@NotNull
	@NotBlank
	@NotEmpty
	private LocalDate dob;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

}
