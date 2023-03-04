package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Flat;
import com.masai.repository.FlatRepository;

@Service
public class FlatServiceImpl implements FlatService{
	
	@Autowired
	private FlatRepository flatrepo;

	@Override
	public List<Flat> getFlatByPriceLessThan(Integer price) {
		 
		  return flatrepo.findByPriceLessThan(price);
	}

	@Override
	public List<Flat> getFlatByPriceLessThanEqualTo(Integer price) {
		return flatrepo.findByPriceLessThanEqual(price);
	}

	@Override
	public List<Flat> getFlatByPriceGreaterThan(Integer price) {
		return flatrepo.findByPriceGreaterThan(price);
	}

	@Override
	public List<Flat> getFlatByPriceBetween(Integer s_price, Integer e_price) {
		return flatrepo.findByPriceBetween(s_price, e_price);
	}

	
}
