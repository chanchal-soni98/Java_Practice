package com.masai.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Flat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer FlatId;
	private String BuildingName;
	@Min(value=10,message="room no should be less than 10")
	private Integer NoOfRooms;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate date_of_manufacturing;
	@Enumerated(EnumType.STRING)
	
	private Facing facing;
	private Integer price;
	private String description;

}
