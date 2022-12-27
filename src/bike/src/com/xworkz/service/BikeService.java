package com.xworkz.service;

import java.util.List;

import com.xworkz.bikedto.BikeDto;

public interface BikeService {
	
	public boolean save(BikeDto dto);
	
	public List<BikeDto> read();
	
	public BikeDto findByName(String name);
	
	public boolean updateNameByIndex(String name,int index);
	
	public boolean deleteByIndex(int index);

}
