package com.xworkz.shoe;

import com.xworkz.shoe.dto.ShoeDto;
import com.xworkz.shoe.repo.ShoeRepo;
import com.xworkz.shoe.repo.ShoeRepoImpl;

public class Runner {

	public static void main(String[] args) {

		ShoeDto dto = new ShoeDto(1, "Sparx", 2499, "Black", "Casual");
		ShoeDto dto1 = new ShoeDto(2, "Nike", 2999, "White", "Sports");
		ShoeDto dto2 = new ShoeDto(3, "Puma", 2199, "Red", "Formals");
		ShoeDto dto3 = new ShoeDto(4, "Adidas", 1499, "Blue", "Crocs");
		ShoeDto dto4 = new ShoeDto(5, "Bata", 1899, "Green", "Normal");

		ShoeRepo repo = new ShoeRepoImpl();
		repo.save(dto);
		repo.save(dto1);
		repo.save(dto2);
		repo.save(dto3);
		repo.save(dto4);

		System.out.println(repo.read());

		System.out.println(repo.findByBrand("Puma"));

		System.out.println(repo.findByIdAndPrice(5, 1899));
	}

}
