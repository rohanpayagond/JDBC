package com.xworkz.bulb;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.service.BulbService;
import com.xworkz.bulb.service.BulbServiceImpl;

public class Tester {

	public static void main(String[] args) {

		BulbDto dto = new BulbDto(1, "Panasonic", 150, "LED", "Small");
		BulbDto dto1 = new BulbDto(2, "Syska", 100, "Halogen", "Medium");
		BulbDto dto2 = new BulbDto(3, "Philips", 140, "Fluorescent", "Round");
		BulbDto dto3 = new BulbDto(4, "Halonix", 180, "Incadescent", "Classic");
		BulbDto dto4 = new BulbDto(5, "Wipro", 90, "LCD", "Pydmy");
		BulbDto dto5 = new BulbDto(6, "Baja", 87, "CFL", "Reflector");
		BulbDto dto6 = new BulbDto(7, "Desidiya", 120, "Halogen", "Mushroom");
		BulbDto dto7 = new BulbDto(8, "Crompton", 155, "LED", "Candle");

		BulbService service = new BulbServiceImpl();

//		service.create(dto);
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto5);
//		service.create(dto6);
//		service.create(dto7);

//		System.out.println(service.readAll());

//		System.out.println(service.findByName("Wipro"));

//		System.out.println(service.findBySize("Round"));

//		System.out.println(service.findByPrice(90));

//		System.out.println(service.updatePriceByName(200, "Crompton"));

//		System.out.println(service.updateNameBySizeAndPrice("Onida", "Medium", 100));

		System.out.println(service.deleteByNameAndPrice("Wipro", 90));

	}

}
