package com.xworkz.repo;

import java.util.List;

import com.xworkz.bikedto.BikeDto;

public interface BikeRepo {
	
	public boolean save(BikeDto dto);
	
	public List<BikeDto> read();
	
	public BikeDto findByName(String name);	
	
	public boolean updateNameByIndex(String name,int index);
	
	public boolean deleteByIndex(int index);



	
	
	
	
	
	
	
	
	
	
	