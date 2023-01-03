package com.xworkz.institute.repo;

import java.util.List;

import com.xworkz.institute.dto.InstituteDto;

public interface InstituteRepo {

	public boolean save(InstituteDto dto);

	public List<InstituteDto> read();

	public boolean updateLocationByIndex(String location, int index);

	public boolean updateCourseByName(String course, String name);

	public boolean deleteByRating(double rating);
	
	public List<InstituteDto> findByNameAndCourse(String name,String course);

	public List<InstituteDto> findByLocationAndRating(String location, double rating);

}
