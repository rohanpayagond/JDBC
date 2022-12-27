package com.xworkz.service;

import java.util.List;

import com.xworkz.laptop.LaptopDto;

public interface LaptopService {
	
	public boolean save(LaptopDto dto);
	
	public List<LaptopDto> read();
	
	public LaptopDto findByName(String name);
	
	public LaptopDto updateNameByIndex(String name,int index);
	
	public boolean deleteByIndex(int index);

}
