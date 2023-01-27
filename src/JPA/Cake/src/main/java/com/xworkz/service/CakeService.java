package com.xworkz.service;

import com.xworkz.dto.CakeDto;

public interface CakeService {

	public boolean save(CakeDto dto);

	public CakeDto findById(int id);

	public boolean updateColorById(String color, int id);

	public boolean deleteById(int id);

}
