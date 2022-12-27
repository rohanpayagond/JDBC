package com.xworkz.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobile.MobileDto;

public class MobileRepoImpl implements MobileRepo {

	List<MobileDto> list = new ArrayList<MobileDto>();

	@Override
	public boolean save(MobileDto dto) {
		System.out.println("Data is Validated and Saving to Database");
		list.add(dto);
		return true;
	}

	@Override
	public List<MobileDto> read() {
		System.out.println("Data Saving to Database");
		return list;
	}

	@Override
	public MobileDto findByBrand(String brand) {
		System.out.println("Data is being Saved to Database");
		return null;
	}

	@Override
	public boolean updateBrandByIndex(String brand, int index) {
		MobileDto dto = list.get(index);
		dto.setBrand(brand);
		list.set(index, dto);
		return false;

	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data Saving to Database..");
		list.remove(index);
		return false;
	}

}
