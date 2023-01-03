package com.xworkz.institute.service;

import java.util.List;

import com.xworkz.institute.dto.InstituteDto;
import com.xworkz.institute.repo.InstituteRepo;
import com.xworkz.institute.repo.InstituteRepoImpl;

public class InstituteServiceImpl implements InstituteService {

	InstituteRepo repo = new InstituteRepoImpl();

	@Override
	public boolean save(InstituteDto dto) {
		System.out.println("Data Validating and Sending to Repo.");
		if (dto != null && dto.getName().length() >= 2 && dto.getCourse().length() >= 2
				&& dto.getLocation().length() >= 2 && dto.getNoOfStudents() >= 45 && dto.getNoOfTrainers() >= 5
				&& dto.getRating() >= 3.5) {
			return repo.save(dto);
		}

		return false;
	}

	@Override
	public List<InstituteDto> read() {
		System.out.println("Data Validating and Sending to Repo..");
		return repo.read();
	}

	@Override
	public boolean updateLocationByIndex(String location, int index) {
		System.out.println("Validating and Sending to Repo...");
		if (location != null && location.length() >= 2 && index >= 0) {
			return repo.updateLocationByIndex(location, index);
		}
		return true;
	}

	@Override
	public boolean updateCourseByName(String course, String name) {
		System.out.println("Validating and Sending to Repo....");
		if (course != null && course.length() >= 2 && name != null && name.length() >= 2) {
			return repo.updateCourseByName(course, name);
		}
		return false;
	}

	@Override
	public boolean deleteByRating(double rating) {
		System.out.println("Sending to Repo.....");
		if (rating >= 3.5) {
			return repo.deleteByRating(rating);
		}
		return true;
	}

	@Override
	public List<InstituteDto> findByNameAndCourse(String name, String course) {
		System.out.println("Validating and Sending to Repo.....");
		if (name != null && name.length() >= 3 && course != null && name.length() >= 3) {
			return repo.findByNameAndCourse(name, course);
		}
		return null;

	}

	@Override
	public List<InstituteDto> findByLocationAndRating(String location, double rating) {
		System.out.println("Data Validating and Sending to Repo..........");
		if (location != null && location.length() >= 2 && rating >= 3.5) {
			return repo.findByLocationAndRating(location, rating);
		}
		return null;
	}

}
