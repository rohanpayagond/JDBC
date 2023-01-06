package com.xworkz.television.service;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public interface TelevisionService {
	
	public boolean save(TelevisionDto dto);
	
	public List<TelevisionDto> read();
	
	public TelevisionDto findByNameAndSize(String name,int size);
	
	public TelevisionDto findTypeAndColorByIndex(String type,String color,int index);
	
	public boolean updateSizeByType(int size,String type);
	
	public boolean deleteByNameAndColor(String name,String color);

}
