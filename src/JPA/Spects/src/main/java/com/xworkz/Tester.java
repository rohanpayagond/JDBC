package com.xworkz;

import java.util.List;

import com.xworkz.dto.SpectsDto;
import com.xworkz.service.SpectsService;
import com.xworkz.service.SpectsServiceImpl;

public class Tester {

	public static void main(String[] args) {

		SpectsDto dto = new SpectsDto(1, "Oakley", "Brown", "Round", 899);
		SpectsDto dto1 = new SpectsDto(2, "Rayban", "Black", "Rectangle", 999);
		SpectsDto dto2 = new SpectsDto(3, "Carrera", "White", "Square", 1085);
		SpectsDto dto3 = new SpectsDto(4, "Horn Rimmed", "Blue", "Aviators", 1150);
		SpectsDto dto4 = new SpectsDto(5, "Barton", "Red", "Geometric", 1250);
		SpectsDto dto5 = new SpectsDto(6, "Costa Del", "Green", "Broline", 799);
		SpectsDto dto6 = new SpectsDto(7, "Clubmaster", "Silver", "Wayfare", 650);
		SpectsDto dto7 = new SpectsDto(8, "Coach", "Yellow", "Oval", 1545);
		SpectsDto dto8 = new SpectsDto(9, "Prada", "Golden", "Cat Eye", 1845);
		SpectsDto dto9 = new SpectsDto(10, "Persol", "Pink", "Triangle", 1899);

		SpectsService service = new SpectsServiceImpl();

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

//		List<SpectsDto> readAll = service.readAll();
//		for (SpectsDto dtos : readAll) {
//			System.out.println(dtos);
//
//		}

//		SpectsDto shapeAndPrice = service.findByShapeAndPrice("Oval", 1545);
//		System.out.println(shapeAndPrice);

//		System.out.println(service.updatePriceByName(1199, "Rayban"));

//		System.out.println(service.updateColorByPriceAndShape("Grey", 1845, "Cat Eye"));

//		System.out.println(service.deleteByPriceAndColor(1899, "Pink"));

		System.out.println(service.deleteByNameAndId("Clubmaster", 7));
	}

}
