package com.xworkz.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.main.TheatreDto;

public class TheatreRepoImpl implements TheatreRepo {

	@Override
	public boolean save(TheatreDto dto) {
		System.out.println("Saved and Sending to Database");
		List<TheatreDto> list = new ArrayList<TheatreDto>();
		list.add(dto);
		System.out.println("Data has been saved to Database Successfully");

		return true;
	}

}
