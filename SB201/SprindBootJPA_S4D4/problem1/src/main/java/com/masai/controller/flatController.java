package com.masai.controller;

import java.util.List;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Flat;
import com.masai.service.flatService;

@RestController
public class flatController {
	
	@Autowired
	private flatService fs;
	
//	@PostMapping("/flat")
//	public ResponseEntity<Flat> saveFlat(@RequestBody Flat f){
//		Flat flat = fs.saveFlat(f);
//		
//		return new ResponseEntity<>(flat,HttpStatus.CREATED);
//	}


	@GetMapping("/flatless")
	public ResponseEntity<List<Flat>> getFlatByPriceLessThanHandler(@PathVariable("price") Integer price) {
		 
		  List<Flat> lfs=fs.getFlatByPriceLessThan(price);
		  return new ResponseEntity<>(lfs,HttpStatus.OK);
				 
	}

	@GetMapping("/flatlessorequal")
	public ResponseEntity<List<Flat>> getFlatByPriceLessThanEqualToHandler(Integer price) {
		 List<Flat> lfs=fs.getFlatByPriceLessThanEqual(price);
		  return new ResponseEntity<>(lfs,HttpStatus.OK);
		
	}

	@GetMapping("/flat/grater")
	public ResponseEntity<List<Flat>> getFlatByPriceGreaterThanHandler(Integer price) {
		List<Flat> lfs=fs.getFlatByPriceGreaterThan(price);
		  return new ResponseEntity<>(lfs,HttpStatus.OK);
	}

	@GetMapping("/flat/between")
	public ResponseEntity<List<Flat>> getFlatByPriceBetweenHandler(Integer s_price, Integer e_price) {
		List<Flat> lfs=fs.getFlatByPriceBetween(s_price, e_price);
		  return new ResponseEntity<>(lfs,HttpStatus.OK);	}
	
}
