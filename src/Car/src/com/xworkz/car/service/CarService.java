package com.xworkz.car.service;

import java.util.List;

import com.xworkz.car.dto.CarDto;

public interface CarService {
	
	public boolean save(CarDto dto);
	
	public List<CarDto> read();
	
	public CarDto findByBrand(String brand);
	
	public boolean updateColorByIndex(String color,int index);
	
	public boolean updateSpeedByBrand(int speed,String brand);
	
	public boolean updatePriceByType(double price,String type);
	
	public boolean deleteByIndex(int index);
	
	public boolean deleteByBrandAndColor(String brand,String color);

}
