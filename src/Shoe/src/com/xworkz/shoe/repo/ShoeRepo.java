package com.xworkz.shoe.repo;

import com.xworkz.shoe.dto.ShoeDto;

public interface ShoeRepo {

	public boolean save(ShoeDto dto);
	
	public ShoeDto read();
	
	public ShoeDto findByBrand(String brand);
	
	public ShoeDto findByIdAndPrice(int id,int price);
}
