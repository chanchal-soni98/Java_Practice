package com.masai.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/app")
public class MyController {
	
	private List<Product> list = new ArrayList<>();
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		
		list.add(new Product(345,"Chelsi",234,"Zara","Electronics",12343,"3453","12/02/1234"));
		return list;
		
	}
//	@GetMapping("/productsByPriceRange")
//	public List<Product> getAllProducts(){
//		if(list.)
//		return list;
//		
//	}
	

}
