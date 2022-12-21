package com.xworkz.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.main.TheatreDto;

public class TheatreRepoImpl implements TheatreRepo {

	List<TheatreDto> list = new ArrayList<TheatreDto>();

	@Override
	public boolean save(TheatreDto dto) {
		System.out.println("Saved and Sending to Database");
		list.add(dto);
		System.out.println("Data has been saved to Database Successfully");

		return true;
	}

	@Override
	public List<TheatreDto> read() {
		return list;
	}

	@Override
	public TheatreDto findByName(String name) {
		for (TheatreDto theatreDto : list) {
			if (theatreDto.getName().equals(name)) {
				return theatreDto;
			}

		}

		return null;
	}

	@Override
	public TheatreDto findBynoOfWorkers(int noOfWorkers) {
		for (TheatreDto dto : list) {
			if (dto.getNoOfWorkers() >= 10) {
				return dto;
			}

		}
		return null;
	}

	@Override
	public List<TheatreDto> findByAffordable(boolean affordable) {

		return list;
	}

	@Override
	public TheatreDto delete(String name) {
		return null;
	}

}
