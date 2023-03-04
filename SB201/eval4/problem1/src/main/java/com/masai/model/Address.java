package com.masai.model;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Size(min=6,max=6, message="pincode should be of 6 character length")
	private String pincode;
	private String state;
	private String city;

}
