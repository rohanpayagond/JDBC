package com.xworkz.main;

import com.xworkz.service.TheatreService;
import com.xworkz.service.TheatreServiceImpl;

public class Runner {

	public static void main(String[] args) {

		TheatreDto dto = new TheatreDto("Narthaki", "Ragvendra", 180, true, 5, "GandhiNagar", 560090, true, 15, false);
		TheatreDto dto1 = new TheatreDto("Gopalan", "Akshay", 150, true, 3, "Malleshwaram", 560080, true, 10, true);
		TheatreDto dto2 = new TheatreDto("Inox", "Anand", 140, true, 5, "BTM", 560070, true, 14, true);
		TheatreDto dto3 = new TheatreDto("Balaji", "Venkat", 145, true, 4, "Jayanagar", 560580, true, 12, false);
		TheatreDto dto4 = new TheatreDto("Swagath", "Chidanand", 197, true, 7, "Jpnagar", 560690, true, 18, true);
		TheatreDto dto5 = new TheatreDto("Renuka", "Maltesh", 124, true, 5, "HSR Layout", 560047, true, 11, false);
		TheatreDto dto6 = new TheatreDto("Cinepolis", "Madhu", 148, true, 8, "Electronic City", 560058, true, 25, true);
		TheatreDto dto7 = new TheatreDto("Srinivas", "Sharath", 169, true, 4, "Majestic", 560035, true, 10, false);
		TheatreDto dto8 = new TheatreDto("Sanghya", "Darshan", 178, true, 3, "Rajajinagar", 560098, true, 17, false);
		TheatreDto dto9 = new TheatreDto("Lakshmi", "Manoj", 210, true, 6, "RRNagar", 560038, true, 20, true);
		TheatreDto dto10 = new TheatreDto("Urvashi", "Akash", 143, true, 4, "Brigade Road", 560124, true, 22, true);
		TheatreDto dto11 = new TheatreDto("Galaxy", "Balu", 202, true, 9, "Shivaji Nagar", 560457, true, 20, false);
		TheatreDto dto12 = new TheatreDto("Balaji", "Dharam", 199, true, 6, "SouthEnd Circle", 560498, true, 18, true);
		TheatreDto dto13 = new TheatreDto("Sharada", "Chandru", 110, true, 8, "Banashankri", 560469, true, 15, false);
		TheatreDto dto14 = new TheatreDto("Triveni", "Suraj", 178, true, 4, "Vijaynagar", 560149, true, 18, true);
		
		TheatreService service = new TheatreServiceImpl();
		service.save(dto);		
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);
		service.save(dto6);
		service.save(dto7);
		service.save(dto8);
		service.save(dto9);
		service.save(dto10);
		service.save(dto11);
		service.save(dto12);
		service.save(dto13);
		service.save(dto14);

		//System.out.println(dto);

	}
}
