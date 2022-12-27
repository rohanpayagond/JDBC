package com.xworkz.laptop;

import java.util.List;

import com.xworkz.service.LaptopService;
import com.xworkz.service.LaptopServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		
		
		LaptopDto laptop = new LaptopDto("Dell", "Latitude", 59745, 12, 128, 10, "Black", true, "i5", 2);
		LaptopDto laptop1 = new LaptopDto("Lenovo", "Ideapad", 37849, 8, 128, 11, "Silver", true, "i3", 1);
		LaptopDto laptop2= new LaptopDto("HP", "Pavilion", 69950, 16, 256, 11, "White", false, "i7", 2);
		LaptopDto laptop3 = new LaptopDto("Acer", "Aspire", 57990, 8, 128, 10, "Grey", true, "i7", 1);
		LaptopDto laptop4 = new LaptopDto("ASUS", "Vivobook", 42400, 16, 256, 10, "Blue", false, "i5", 1);
		LaptopDto laptop5 = new LaptopDto("Sony", "Vaio", 42350, 8, 128, 9, "Bluish White", true, "i3", 2);
		LaptopDto laptop6 = new LaptopDto("Apple", "Macbook", 86990, 8, 128, 10, "Red", false, "i5", 2);
		LaptopDto laptop7 = new LaptopDto("Compaq", "Presario", 38490, 8, 128, 8, "Bluish Black", true, "i3", 1);
		LaptopDto laptop8 = new LaptopDto("Toshiba", "Satellite", 44570, 4, 128, 8, "Reddish White", true, "i5", 2);
		LaptopDto laptop9 = new LaptopDto("Microsoft", "Latitude", 74250, 12, 256, 11, "Whitish Black", false, "i5", 1);
		LaptopDto laptop10 = new LaptopDto("Alienware", "Alien", 68549, 16, 256, 110, "Greenish White", false, "i3", 1);
		LaptopDto laptop11 = new LaptopDto("Gateway", "Rover", 64780, 8, 128, 9, " Blackish Blue", false, "i5", 1);
		LaptopDto laptop12 = new LaptopDto("Packard Bell", "Package", 74250, 16, 256, 10, "Reddish Black", false, "i3", 1);
		LaptopDto laptop13 = new LaptopDto("Samsung", "Flex", 130240, 12, 512, 11, "Matt Black", false, "i7", 2);
		LaptopDto laptop14 = new LaptopDto("Xiaomi", "Redmibook", 30990, 8, 128, 10, "Siver Matt", true, "i5", 1);

		LaptopService service = new LaptopServiceImpl();
		service.save(laptop);
		service.save(laptop1);
		service.save(laptop2);
		service.save(laptop3);
		service.save(laptop4);
		service.save(laptop5);
		service.save(laptop6);
		service.save(laptop7);
		service.save(laptop8);
		service.save(laptop9);
		service.save(laptop10);
		service.save(laptop11);
		service.save(laptop12);
		service.save(laptop13);
		service.save(laptop14);

		

		List<LaptopDto> read = service.read();
		for(LaptopDto data : read)
			System.out.println(data);
		
		 LaptopDto findByName = service.findByName("Flex");
		System.out.println(findByName);
		
		LaptopDto update = service.updateNameByIndex("Galaxy", 5);
			System.out.println(update);
			
			boolean delete = service.deleteByIndex(2);
			System.out.println("delete");
			
			
			
	

	}

}
