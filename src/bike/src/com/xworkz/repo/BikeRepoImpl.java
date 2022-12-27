package com.xworkz.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.bikedto.BikeDto;

public class BikeRepoImpl implements BikeRepo {

	List<BikeDto> list = new ArrayList<BikeDto>();
	
	@Override
	public boolean save(BikeDto dto) {
		System.out.println("Data Saving to DB....");
		list.add(dto);
		
		return true;
	}

	@Override
	public List<BikeDto> read() {
		System.out.println("Data Saving to Database........");
		return list;
	}

	@Override
	public BikeDto findByName(String name) {
		System.out.println("Data sending to database");
		return null;
	}

	@Override
	public boolean updateNameByIndex(String name, int index) {
		BikeDto bikeDto = list.get(index);
		bikeDto.setName(name);
		list.set(index, bikeDto);
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		list.remove(index);
		return false;
	}

}
