package com.xworkz.institute;

import java.util.List;

import com.xworkz.institute.dto.InstituteDto;
import com.xworkz.institute.service.InstituteService;
import com.xworkz.institute.service.InstituteServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		InstituteService service = new InstituteServiceImpl();
		
		InstituteDto dto = new InstituteDto("Xworkz", "BTM", 6, 50,"Java",4.5);
		InstituteDto dto1 = new InstituteDto("Qspiders", "Rajajinagar", 15, 500,"Testing",4.2);
		InstituteDto dto2 = new InstituteDto("Jspiders", "Jayanagar", 12, 300,"Machine Learning",4.0);
		InstituteDto dto3 = new InstituteDto("Pyspiders", "Basavanagudi", 13, 420,"Python",4.1);
		InstituteDto dto4 = new InstituteDto("Kodnest", "Jpnagar", 10, 180,"Data Science",3.85);
		
		
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		
		List<InstituteDto> read = service.read();
		System.out.println(read);
		
//		boolean update = service.updateLocationByIndex("RRNagar", 2);
//		System.out.println(update);
//		System.out.println(read);
//		
//		boolean updateCourse = service.updateCourseByName("Data Analyst", "Xworkz");
//		System.out.println(updateCourse);
//		System.out.println(read);
//		
//		boolean delete = service.deleteByRating(4.2);
//		System.out.println(delete);
//		System.out.println(read);
		
		List<InstituteDto> find = service.findByNameAndCourse("Kodnest", "Data Science");
		System.out.println(find);
		
		List<InstituteDto> find1 = service.findByLocationAndRating("Jayanagar", 4.0);
		System.out.println(find1);


		
	

		


		
		
		

	}

}
