package com.masai.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;

@Entity
public class Flat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer FlatId; 
	private String BuildingName;
	@Max(10)
	private Integer NoOfRooms;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate date_of_manufacturing;
	private String  Facing;   //: (East, West, Nort, South)
    private Integer price;
	private String description;
	
	
	public Flat(Integer flatId, String buildingName, @Max(10) Integer noOfRooms, LocalDate date_of_manufacturing,
			String facing, Integer price, String description) {
		super();
		FlatId = flatId;
		BuildingName = buildingName;
		NoOfRooms = noOfRooms;
		this.date_of_manufacturing = date_of_manufacturing;
		Facing = facing;
		this.price = price;
		this.description = description;
	}
	
	
	public Flat() {
		
		
	}


	public Integer getFlatId() {
		return FlatId;
	}


	public void setFlatId(Integer flatId) {
		FlatId = flatId;
	}


	public String getBuildingName() {
		return BuildingName;
	}


	public void setBuildingName(String buildingName) {
		BuildingName = buildingName;
	}


	public Integer getNoOfRooms() {
		return NoOfRooms;
	}


	public void setNoOfRooms(Integer noOfRooms) {
		NoOfRooms = noOfRooms;
	}


	public LocalDate getDate_of_manufacturing() {
		return date_of_manufacturing;
	}


	public void setDate_of_manufacturing(LocalDate date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}


	public String getFacing() {
		return Facing;
	}


	public void setFacing(String facing) {
		Facing = facing;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Flat [FlatId=" + FlatId + ", BuildingName=" + BuildingName + ", NoOfRooms=" + NoOfRooms
				+ ", date_of_manufacturing=" + date_of_manufacturing + ", Facing=" + Facing + ", price=" + price
				+ ", description=" + description + "]";
	}
	
	
	
	
	
	
	
}
