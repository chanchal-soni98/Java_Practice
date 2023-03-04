package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Flat;
import com.masai.service.FlatService;

@RestController
public class FlatController {

	@Autowired
	private FlatService flatservice;
	
	
	@GetMapping("/flatless")
	public ResponseEntity<List<Flat>> getFlatByPriceLessThanHandler(Integer price) {
		 
		  List<Flat> lfs=flatservice.getFlatByPriceLessThan(price);
		  return new ResponseEntity<>(lfs,HttpStatus.OK);
				 
	}

	@GetMapping("/flatlessorequal")
	public ResponseEntity<List<Flat>> getFlatByPriceLessThanEqualToHandler(Integer price) {
		 List<Flat> lfs=flatservice.getFlatByPriceLessThanEqualTo(price);
		  return new ResponseEntity<>(lfs,HttpStatus.OK);
		
	}

	@GetMapping("/flat/grater")
	public ResponseEntity<List<Flat>> getFlatByPriceGreaterThanHandler(Integer price) {
		List<Flat> lfs=flatservice.getFlatByPriceGreaterThan(price);
		  return new ResponseEntity<>(lfs,HttpStatus.OK);
	}

	@GetMapping("/flat/between")
	public ResponseEntity<List<Flat>> getFlatByPriceBetweenHandler(Integer s_price, Integer e_price) {
		List<Flat> lfs=flatservice.getFlatByPriceBetween(s_price,e_price);
		  return new ResponseEntity<>(lfs,HttpStatus.OK);	}
	
}
