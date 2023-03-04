package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Flat;

@Repository
public interface FlatRepository extends JpaRepository<Flat, Integer>{
 
	public List<Flat> findByPriceLessThan(Integer price);
	public List<Flat> findByPriceLessThanEqual(Integer price);
	public List<Flat> findByPriceGreaterThan(Integer price);
	public List<Flat> findByPriceBetween(Integer s_price,Integer e_price);
	
}
