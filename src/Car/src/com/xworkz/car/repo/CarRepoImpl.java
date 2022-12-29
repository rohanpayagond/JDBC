package com.xworkz.car.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.car.dto.CarDto;

public class CarRepoImpl implements CarRepo {

	List<CarDto> list = new ArrayList<CarDto>();

	@Override
	public boolean save(CarDto dto) {
		System.out.println("Saving to Database Successfully");
		list.add(dto);
		return true;
	}

	@Override
	public List<CarDto> read() {
		System.out.println("Saving To Database");
		return list;
	}

	@Override
	public CarDto findByBrand(String brand) {
		System.out.println("Data Saving to Database");
		return null;
	}

	@Override
	public boolean updateColorByIndex(String color, int index) {
		System.out.println("Data Saving to Database..");
		CarDto dto = list.get(index);
		dto.setColor(color);
		list.set(index, dto);
		return true;
	}

	@Override
	public boolean updateSpeedByBrand(int speed, String brand) {
		for (int i = 0; i < list.size(); i++) {
			CarDto dto = list.get(i);
			if (dto.getBrand().equals(brand)) {
				dto.setSpeed(speed);
				list.set(i, dto);
				return true;
			}

		}
		return false;
	}

	@Override
	public boolean updatePriceByType(double price, String type) {
		for (int i = 0; i < list.size(); i++) {
			CarDto dto = list.get(i);
			if(dto.getType().equals(type)) {
				dto.setPrice(price);
				list.set(i, dto);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Saving to Database");
		list.remove(index);
		return true;
	}

	@Override
	public boolean deleteByBrandAndColor(String brand, String color) {
		Iterator<CarDto> itr = list.iterator();
		while(itr.hasNext()) {
			CarDto dto = itr.next();
			if(dto.getBrand().equals(brand) && dto.getColor().equals(color)) {
				itr.remove();
			}
		}
		return false;
	}



	

}
