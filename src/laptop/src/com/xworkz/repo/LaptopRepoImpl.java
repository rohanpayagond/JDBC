package com.xworkz.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.laptop.LaptopDto;

public class LaptopRepoImpl implements LaptopRepo {
	
	List <LaptopDto>list = new ArrayList<LaptopDto>();

	@Override
	public boolean save(LaptopDto dto) {
		System.out.println("Data Saving to Database");
		list.add(dto);
		System.out.println("Data saved Successfully");
		return true;
	}

	@Override
	public List<LaptopDto> read() {
		System.out.println("Data is Saved to Database");
		return list;
	}

	@Override
	public LaptopDto findByName(String name) {
		System.out.println("Data Saving to Database");
		
		return null;
	}

	@Override
	public LaptopDto updateNameByIndex(String name, int index) {
		System.out.println("Data saving to Database");
		LaptopDto laptop = list.get(index);
		laptop.setName(name);
		list.add(index, laptop);
		return laptop;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data Saving to Database");
		list.remove(index);
		return false;
	}

}
