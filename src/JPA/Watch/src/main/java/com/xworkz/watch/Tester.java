package com.xworkz.watch;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImpl;

public class Tester {

	public static void main(String[] args) {

		WatchDto dto = new WatchDto(1, "Titan", 2500, "White", 25);
		WatchDto dto1 = new WatchDto(2, "Fastrack", 2000, "Grey", 22);
		WatchDto dto2 = new WatchDto(3, "G-Shock", 3500, "Black", 18);
		WatchDto dto3 = new WatchDto(4, "Rolex", 5000, "Golden", 20);
		WatchDto dto4 = new WatchDto(5, "Omega", 4500, "Red", 26);
		WatchDto dto5 = new WatchDto(6, "Cartier", 4800, "Blue", 30);
		WatchDto dto6 = new WatchDto(7, "Seiko", 2800, "Silver", 35);
		WatchDto dto7 = new WatchDto(8, "Timex", 4200, "Pink", 32);
		WatchDto dto8 = new WatchDto(9, "Blancpain", 5800, "Green", 31);
		WatchDto dto9 = new WatchDto(10, "Jaegar", 6500, "Brown", 38);

		WatchService service = new WatchServiceImpl();

//		service.create(dto);
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto5);
//		service.create(dto6);
//		service.create(dto7);
//		service.create(dto8);
//		service.create(dto9);

//		System.out.println(service.readAll());

		System.out.println(service.findByBrand("Jaegar"));

	}

}
