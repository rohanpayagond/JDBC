package com.xworkz.bikedto;

import java.util.List;

import com.xworkz.service.BikeService;
import com.xworkz.service.BikeServiceImpl;

public class BikeRunner {

	public static void main(String[] args) {
		
		BikeDto bike = new BikeDto("Hero", 85699, "Red", 4);
		BikeDto bike1 = new BikeDto("Honda", 78999, "Grey", 4);
		BikeDto bike2 = new BikeDto("TVS", 72459, "Brown", 5);
		BikeDto bike3 = new BikeDto("ROYAL ENFIELD", 189999, "Black", 5);
		BikeDto bike4 = new BikeDto("YAMAHA", 137599, "Green", 3);
		
		BikeService service = new BikeServiceImpl();
		service.save(bike);
		service.save(bike1);
		service.save(bike2);
		service.save(bike3);
		service.save(bike4);
		
		List<BikeDto> read = service.read();
		for(BikeDto dto : read)
			System.out.println(dto);
		
		BikeDto find = service.findByName("TVS");
		System.out.println(find);
		
		boolean update = service.updateNameByIndex("BMW", 2);
		System.out.println(update);
		
		List<BikeDto> read2 = service.read();
		for(BikeDto dto : read2)
			System.out.println(dto);
		
		boolean delete= service.deleteByIndex(4);
		System.out.println(delete);
		
		List<BikeDto> read3 = service.read();
		for(BikeDto dto : read3)
			System.out.println(dto);
		
		
		
		


	}

}
