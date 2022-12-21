package com.xworkz.repo;

import java.util.List;

import com.xworkz.main.TheatreDto;

public interface TheatreRepo {

	public boolean save(TheatreDto dto);

	public List<TheatreDto> read();

	public TheatreDto findByName(String name);

	public TheatreDto findBynoOfWorkers(int noOfWorkers);
	
	public List<TheatreDto> findByAffordable(boolean affordable);
	
	public TheatreDto delete(String name);

}
