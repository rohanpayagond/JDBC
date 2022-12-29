package com.xworkz.car.service;

import java.util.List;

import com.xworkz.car.dto.CarDto;
import com.xworkz.car.repo.CarRepo;
import com.xworkz.car.repo.CarRepoImpl;

public class CarServiceImpl implements CarService {
	
	CarRepo repo = new CarRepoImpl();

	@Override
	public boolean save(CarDto dto) {
		System.out.println("Data Validating and Sending to Repo.");
		if(dto!=null && dto.getBrand().length()>=2 && dto.getPrice()>12.00 && dto.getColor().length()>=2
				&& dto.getSpeed()>150 && dto.getType().length()>=3) {
			return repo.save(dto);
		}
		return false;
	}

	@Override
	public List<CarDto> read() {
		System.out.println("Data Validating and sending to Repo..");
		return repo.read();
	}

	@Override
	public CarDto findByBrand(String brand) {
		System.out.println("Data validating and Sending to Repo...");
		List<CarDto> read = repo.read();
		for(CarDto dto : read)
			if(dto!=null && dto.getBrand().equals(brand) && dto.getBrand().length()>=2) {
				return dto;
			}
			else {
				System.out.println("Invalid Data");
			}
		return null;
	}

	@Override
	public boolean updateColorByIndex(String color, int index) {
		System.out.println("Data Validating and Sending to Repo....");
		if(color!=null && color.length()>=3 && index>=0) {
			return repo.updateColorByIndex(color, index);
		}
		return false;
	}

	@Override
	public boolean updateSpeedByBrand(int speed, String brand) {
		System.out.println("Data Validating and Sending to Repo...");
		if(speed>=150 && speed<=250 && brand!=null && brand.length()>=2) {
			return repo.updateSpeedByBrand(speed,brand);
		}
		return false;
	}

	@Override
	public boolean updatePriceByType(double price, String type) {
		System.out.println("Data Validating and sending to Repo....");
		if(price>=12.0 && type!=null && type.length()>=3) {
			return repo.updatePriceByType(price,type);
		}
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data Validating and Sending to Repo....");
		if(index>=0) {
			return repo.deleteByIndex(index);
		}
		return false;
	}

	@Override
	public boolean deleteByBrandAndColor(String brand, String color) {
		System.out.println("Data validating and sending to Repo");
		if(brand!=null && brand.length()>=3 && color!=null && color.length()>=3) {
			return repo.deleteByBrandAndColor(brand,color);
		}
		return false;
	}

}
