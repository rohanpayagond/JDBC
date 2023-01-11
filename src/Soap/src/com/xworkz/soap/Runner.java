package com.xworkz.soap;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;
import com.xworkz.soap.repo.SoapRepo;
import com.xworkz.soap.repo.SoapRepoImpl;

public class Runner {

	public static void main(String[] args) {

		SoapDto dto = new SoapDto(1, "Medimix", 45, "Green", "Sandalwood", 75, 2021, "AntiSeptic");
		SoapDto dto1 = new SoapDto(2, "Santoor", 38, "Orange", "Almond Oil", 68, 2010, "Turmeric");
		SoapDto dto2 = new SoapDto(3, "MysoreSandal", 35, "Yellow", "Rose Oil", 60, 2012, "Herbal");
		SoapDto dto3 = new SoapDto(4, "Dove", 48, "White", "Lily", 65, 2014, "Moisturising");
		SoapDto dto4 = new SoapDto(5, "Dettol", 28, "Black", "Tulsi", 77, 2013, "Medical");
		SoapDto dto5 = new SoapDto(6, "Pears", 42, "Pale Yellow", "Lavender", 80, 2015, "Bodywash");
		SoapDto dto6 = new SoapDto(7, "Lux", 20, "Pink", "Margo", 81, 2011, "Olive Oil");
		SoapDto dto7 = new SoapDto(8, "Surf Excel", 15, "Blue", "Lily", 62, 2018, "Laundry");
		SoapDto dto8 = new SoapDto(9, "Wheel", 10, "Light Green", "Jasmine", 55, 2019, "Laundry");
		SoapDto dto9 = new SoapDto(10, "Vim", 55, "Navy Blue", "Neem", 52, 2020, "Utensils");

		SoapRepo repo = new SoapRepoImpl();
//		repo.save(dto);
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
//		repo.save(dto7);
//		repo.save(dto8);
//		repo.save(dto9);

//		List<SoapDto> read = repo.read();
//		for (SoapDto dtos : read) {
//			System.out.println(dtos);
//		}
		

//		System.out.println(repo.findByNameAndPrice("Vim", 55));
		
//		System.out.println(repo.updateNameByPrice("Lifeboy", 38));
//		List<SoapDto> read = repo.read();
//		for (SoapDto dtos : read) {
//			System.out.println(dtos);
//		}
		
//		System.out.println(repo.updateColorAndFragranceByName("Maroon", "Sandal", "Dettol"));
//		List<SoapDto> read = repo.read();
//		for (SoapDto dtos : read) {
//			System.out.println(dtos);
//		}
		
//		System.out.println(repo.updateTypeById("Acne", 6));
//		List<SoapDto> read = repo.read();
//		for (SoapDto dtos : read) {
//			System.out.println(dtos);
//		}
		
		System.out.println(repo.deleteById(5));
		List<SoapDto> read = repo.read();
		for (SoapDto dtos : read) {
			System.out.println(dtos);
		}
	}

}
