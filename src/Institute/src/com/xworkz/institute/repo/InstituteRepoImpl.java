package com.xworkz.institute.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.institute.dto.InstituteDto;

public class InstituteRepoImpl implements InstituteRepo {

	List<InstituteDto> list = new ArrayList<InstituteDto>();

	@Override
	public boolean save(InstituteDto dto) {
		System.out.println("Saved and Sending to Database.");
		list.add(dto);
		return true;
	}

	@Override
	public List<InstituteDto> read() {
		System.out.println("Sending to Database..");
		return list;
	}

	@Override
	public boolean updateLocationByIndex(String location, int index) {
		System.out.println("Data Sending to Database...");
		InstituteDto dto = list.get(index);
		dto.setLocation(location);
		list.set(index, dto);
		return true;
	}

	@Override
	public boolean updateCourseByName(String course, String name) {
		System.out.println("Data Sending to Database....");
		for (int i = 0; i < list.size(); i++) {
			InstituteDto dto = list.get(i);
			if (dto.getName().equals(name)) {
				dto.setCourse(course);
				list.set(i, dto);
				return true;
			}

		}
		return false;
	}

	@Override
	public boolean deleteByRating(double rating) {
		System.out.println("Data Sending to Repo.....");
		for (int i = 0; i < list.size(); i++) {
			InstituteDto dto = list.get(i);
			if (dto.getRating() == rating) {
				list.remove(i);

			}

		}
		return true;
	}

	@Override
	public List<InstituteDto> findByNameAndCourse(String name, String course) {
		System.out.println("Data Sending to Repo......");
		for (InstituteDto dto : list) {
			if (dto.getName().equals(name) && dto.getCourse().equals(course)) {
				System.out.println(dto);

			}
		}
		return null;

	}

	@Override
	public List<InstituteDto> findByLocationAndRating(String location, double rating) {
		System.out.println("Sending to Database....");
		for (InstituteDto dto : list) {
			if (dto.getLocation().equals(location) && dto.getRating() >= 3.5) {
				System.out.println(dto);
			}
		}
		return null;
	}

}
