package com.xworkz.chocolate;

import java.util.List;

import com.xworkz.dto.ChocolateDto;
import com.xworkz.service.ChocolateService;
import com.xworkz.service.ChocolateServiceImpl;

public class Tester {

	public static void main(String[] args) {

		ChocolateDto dto = new ChocolateDto(1, "Kitkat", 20, "Brown", 38);
		ChocolateDto dto1 = new ChocolateDto(2, "Diary Milk", 25, "BLack", 42);
		ChocolateDto dto2 = new ChocolateDto(3, "MilkyBar", 15, "White", 35);
		ChocolateDto dto3 = new ChocolateDto(4, "5Star", 35, "Golden", 45);
		ChocolateDto dto4 = new ChocolateDto(6, "Eclairsss", 40, "Yellow", 50);

		ChocolateService service = new ChocolateServiceImpl();

//		service.create(dto);
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);

//		List<ChocolateDto> all = service.readAll();
//		for (ChocolateDto chocolateDto : all) {
//			System.out.println(chocolateDto);
//		}

//		ChocolateDto byColorAndWeight = service.findByColorAndWeight("Brown", 38);
//		System.out.println(byColorAndWeight);

//		System.out.println(service.findByPriceAndName(40, "Eclairs"));

//		System.out.println(service.updateWeightByNameAndColor(60, "MilkyBar", "White"));

//		System.out.println(service.updateNameByIdAndWeight("Fusion", 4, 45));

		System.out.println(service.deleteByColorAndName("White", "MilkyBar"));

	}

}
