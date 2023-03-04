package com.masai.service;

import java.util.List;

import com.masai.model.Flat;

public interface FlatService {

	public List<Flat> getFlatByPriceLessThan(Integer price);

	public List<Flat> getFlatByPriceLessThanEqualTo(Integer price);

	public List<Flat> getFlatByPriceGreaterThan(Integer price);

	public List<Flat> getFlatByPriceBetween(Integer s_price,Integer e_price);
}
