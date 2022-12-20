package com.xworkz.main;

import com.xworkz.service.TheatreService;
import com.xworkz.service.TheatreServiceImpl;

public class Runner {

	public static void main(String[] args) {

		TheatreDto dto = new TheatreDto("Narthaki", "Ragvendra", 180, true, 5, "GandhiNagar", 560090, true, 15, false);

		TheatreService service = new TheatreServiceImpl();
		service.save(dto);
		System.out.println(dto);

	}
}
