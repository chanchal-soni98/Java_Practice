package com.masai.service;

import java.util.List;

import com.masai.model.Flat;

public interface flatService {
	
//	public Flat saveFlat(Flat f);
	
	public List<Flat> getFlatByPriceLessThan(Integer price);

	public List<Flat> getFlatByPriceLessThanEqual(Integer price);
//
	public List<Flat> getFlatByPriceGreaterThan(Integer price);

	public List<Flat> getFlatByPriceBetween(Integer s_price,Integer e_price);

}