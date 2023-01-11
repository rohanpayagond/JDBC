package com.xworkz.soap.repo;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;

public interface SoapRepo {
	
	public boolean save(SoapDto dto);
	
	public List<SoapDto> read();
	
	public SoapDto findByNameAndPrice(String name,int price);
	
	public boolean updateNameByPrice(String name,int price);
	
	public boolean updateColorAndFragranceByName(String color,String fragrance,String name);
	
	public boolean updateTypeById(String type,int id);
	
	public boolean deleteById(int id);
	

}
