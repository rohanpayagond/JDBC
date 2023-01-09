package com.xworkz.tree;

import com.xworkz.tree.dto.TreeDto;
import com.xworkz.tree.repo.TreeRepo;
import com.xworkz.tree.repo.TreeRepoImpl;

public class Runner {

	public static void main(String[] args) {

		TreeDto dto = new TreeDto("Maple", "Corniferous", "Europe", 101, "Palmate", "Linden", 45, 79, false, false);
		TreeDto dto1 = new TreeDto("Pine", "Evergreen", "North-America", 94, "Poplar", "Pedate", 39, 71, true, false);
		TreeDto dto2 = new TreeDto("Teak", "Semi-Deciduous", "Australia", 84, "Rowan", "Bipartite", 34, 69, false, true);
		TreeDto dto3 = new TreeDto("Neem", "Temperate", "Asia", 78, "Palmate", "Lobate", 52, 65, true, false);
		TreeDto dto4 = new TreeDto("Sal", "Abscission", "South-America", 112, "Viburnum", "Cordate", 33, 97, false, true);

		TreeRepo repo = new TreeRepoImpl();

		repo.save(dto);
		repo.save(dto1);
		repo.save(dto2);
		repo.save(dto3);
		repo.save(dto4);
		
		TreeDto read = repo.read();
		System.out.println(read);
	}

}
