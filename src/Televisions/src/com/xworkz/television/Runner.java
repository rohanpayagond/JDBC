package com.xworkz.television;

import com.xworkz.television.dto.TelevisionDto;
import com.xworkz.television.service.TelevisionService;
import com.xworkz.television.service.TelevisionServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		TelevisionService service = new TelevisionServiceImpl();

		
		TelevisionDto dto = new TelevisionDto("Samsung", 18000, "LED", "Black", 25);
		TelevisionDto dto1 = new TelevisionDto("Onida", 22000, "LCD", "Blue", 32);
		TelevisionDto dto2 = new TelevisionDto("Panasonic", 15000, "Curved", "White", 35);
		
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		
		System.out.println("            ");
		System.out.println(service.read());
		
		System.out.println("            ");
		System.out.println(service.findByNameAndSize("Onida", 32));
		
		System.out.println("            ");
		System.out.println(service.findTypeAndColorByIndex("LED", "Black", 0));
		
		System.out.println("            ");
		System.out.println(service.updateSizeByType(40, "Curved"));
		System.out.println(service.read());
		
		System.out.println("            ");
		System.out.println(service.deleteByNameAndColor("Samsung", "Black"));
		System.out.println(service.read());
		
		

	}

}
