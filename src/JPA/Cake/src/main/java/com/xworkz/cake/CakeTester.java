package com.xworkz.cake;

import com.xworkz.dto.CakeDto;
import com.xworkz.service.CakeService;
import com.xworkz.service.CakeServiceImpl;

public class CakeTester {

	public static void main(String[] args) {

		CakeDto dto = new CakeDto(1, "Pastry", 50, "Cream", "Black");
		CakeDto dto1 = new CakeDto(2, "Chocolate Cake", 40, "Chocolate", "Brown");
		CakeDto dto2 = new CakeDto(3, "Cupcake", 10, "Bread", "White");
		CakeDto dto3 = new CakeDto(4, "CheeseCake", 35, "Cheese", "Yellow");
		CakeDto dto4 = new CakeDto(5, "Butter", 60, "Butter", "Golden");

		CakeService service = new CakeServiceImpl();
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);

//		System.out.println(service.findById(4));

//		System.out.println(service.updateColorById("Red", 5));

		System.out.println(service.deleteById(1));
	}

}
