package com.xworkz.bag;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.repo.BagRepo;
import com.xworkz.bag.repo.BagRepoImpl;

public class Runner {

	public static void main(String[] args) {

		BagDto dto = new BagDto(1, "WildCraft", "Black", 1999, 15);
		BagDto dto1 = new BagDto(2, "Globus", "Red", 1899, 18);
		BagDto dto2 = new BagDto(3, "Puma", "White", 2199, 20);
		BagDto dto3 = new BagDto(4, "Skybags", "Green", 1499, 22);
		BagDto dto4 = new BagDto(5, "American Tourister", "Blue", 2599, 30);

		BagRepo repo = new BagRepoImpl();
//		repo.save(dto);
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
		
	//	System.out.println(repo.findByName("Puma"));
		
		System.out.println(repo.findByNameAndId("Puma", 3));

	}

}
