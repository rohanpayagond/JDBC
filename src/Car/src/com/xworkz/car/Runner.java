package com.xworkz.car;

import com.xworkz.car.dto.CarDto;
import com.xworkz.car.service.CarService;
import com.xworkz.car.service.CarServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		CarService service = new CarServiceImpl();
		
		CarDto dto = new CarDto("Renault",12.89,"Silver","SUV",175);
		CarDto dto1 = new CarDto("Audi",44.23,"Black","Convertible",241);
		CarDto dto2 = new CarDto("Toyota",27.45,"Grey","Sedan",228);
		CarDto dto3 = new CarDto("Mahindra",19.62,"Red","Coupe",189);
		CarDto dto4 = new CarDto("Jaguar",77.42,"Matt Black","Sports Car",250);
		
		
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		
		System.out.println(service.read());
		
		System.out.println(service .findByBrand("Jaguar"));
		
		boolean update = service.updateColorByIndex("Green", 1);
		System.out.println(update);
		
		System.out.println(service.read());
		
		boolean updateSpeed= service.updateSpeedByBrand(200, "Audi");
		System.out.println(updateSpeed);
		
		System.out.println(service.read());
		
		boolean updatePrice = service.updatePriceByType(25.5, "Coupe");
		System.out.println(updatePrice);
		
		System.out.println(service.read());
		
		boolean delete = service.deleteByIndex(1);
		System.out.println(delete);
		
		System.out.println(service.read());
		
		boolean deleteBy = service.deleteByBrandAndColor("Mahindra", "Red");
		System.out.println(deleteBy);
		
		System.out.println(service.read());




		
		
		
		
		
		
		
		
		
		

	}

}
