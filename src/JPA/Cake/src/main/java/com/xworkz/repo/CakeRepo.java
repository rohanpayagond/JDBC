package com.xworkz.repo;

import com.xworkz.dto.CakeDto;

public interface CakeRepo {

	boolean save(CakeDto dto);

	public CakeDto findById(int id);

	public boolean updateColorById(String color, int id);

	public boolean deleteById(int id);

}
