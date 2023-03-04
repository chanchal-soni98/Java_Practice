package com.masai.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Facing;
import com.masai.model.Flat;



import jakarta.validation.Valid;

@RestController
@RequestMapping("/app")
public class FlatController {
	
	static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	static List<Flat> flats = new ArrayList<>();
	static {
		
		flats.add(new Flat(12,"soni",34,LocalDate.parse("23-01-1998",format),Facing.North,342,"ready"));
	}
	
	@GetMapping("/flat/{flatId}")
	public ResponseEntity<Flat> createFlatDetails(@PathVariable("flatId") Integer flatId){
		
		Flat flat = new Flat();
		flat.setFlatId(flatId);
		flat.setBuildingName("Runwal");
		flat.setNoOfRooms(34);
		flat.setDate_of_manufacturing(LocalDate.parse("23-01-1998",format));
		flat.setFacing(Facing.East);
		flat.setPrice(4566);
		flat.setDescription("Room is ready");
			
		return new ResponseEntity<>(flat, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/flats")
	public ResponseEntity<List<Flat>> createFlatList(){
		
		Flat flat = new Flat();
		flat.setFlatId(34);
		flat.setBuildingName("Runwal");
		flat.setNoOfRooms(34);
		flat.setDate_of_manufacturing(LocalDate.parse("12-02-1199",format));
		flat.setFacing(Facing.East);
		flat.setPrice(4566);
		flat.setDescription("Room is ready");
		
		Flat flat2 = new Flat();
		flat2.setFlatId(32);
		flat2.setBuildingName("Runwal2");
		flat2.setNoOfRooms(14);
		flat2.setDate_of_manufacturing(LocalDate.parse("12-02-1199",format));
		
		flat2.setFacing(Facing.West);
		flat2.setPrice(1566);
		flat2.setDescription("Room is ready");
		flats.add(flat);
		flats.add(flat2);
			
		return new ResponseEntity<>(flats, HttpStatus.CREATED);
		
	}
	
	@PostMapping("/flat")
	public ResponseEntity<Flat> addFlatDetails(@Valid @RequestBody Flat flat){
		
			
		return new ResponseEntity<>(flat, HttpStatus.CREATED);
		
	}
	@PutMapping("/flatById/{flatId}")
	public ResponseEntity<Flat> updateFlatPiceById(@Valid @RequestBody Flat flat, @PathVariable("flatId") Integer flatId){
		
		flat.setPrice(flat.getPrice()+120);
		
		flat.setFlatId(flatId);
		
		return new ResponseEntity<>(flat,HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping("/flatByRooms/{flatId}")
	public ResponseEntity<Flat> updateFlatRoomNumberById(@Valid @RequestBody Flat flat, @PathVariable("flatId") Integer flatId){
		
		flat.setNoOfRooms(flat.getNoOfRooms()+10);
		
		flat.setFlatId(flatId);
		
		return new ResponseEntity<>(flat,HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("flat/{flatId}")
	public ResponseEntity<String> deleteFlat(@PathVariable("flatId") Integer flatId){
		for (Flat f : flats) {

			if (f.getFlatId() == flatId) {

				ResponseEntity<String> rs = new ResponseEntity<>(f.getBuildingName() + " deleted successfully.",HttpStatus.ACCEPTED);
				
				System.out.println(f);
				flats.remove(f);
				
				return rs;
			}

		}
		return new ResponseEntity<>("NOt founded",HttpStatus.ACCEPTED);

	}

}
