package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repository.FlatRepo;
import com.masai.model.Flat;

@Service
public class flatServiceImpl implements flatService {
	
	@Autowired
	private FlatRepo fr;
	
//	@Override
//	public Flat saveFlat(Flat f) {
//		
//		return fr.save(f);
//	}

	@Override
	public List<Flat> getFlatByPriceLessThan(Integer price) {
		// TODO Auto-generated method stub
		return fr.findByPriceLessThan(price);
	}

	public List<Flat> getFlatByPriceLessThanEqual(Integer price) {
		// TODO Auto-generated method stub
		return fr.findByPriceLessThanEqual(price);
	}
		

	@Override
	public List<Flat> getFlatByPriceGreaterThan(Integer price) {
		// TODO Auto-generated method stub
		return fr.findByPriceGreaterThan(price);
	}
//
	@Override
	public List<Flat> getFlatByPriceBetween(Integer s_price, Integer e_price) {
		// TODO Auto-generated method stub
		return fr.findByPriceBetween(s_price, e_price);
	}



}
