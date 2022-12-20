package com.xworkz.service;

import com.xworkz.main.TheatreDto;
import com.xworkz.repo.TheatreRepo;
import com.xworkz.repo.TheatreRepoImpl;

public class TheatreServiceImpl implements TheatreService {
	
	TheatreRepo repo = new TheatreRepoImpl();

	@Override
	public boolean save(TheatreDto dto) {
		System.out.println("Validated and Saved and sending to Repo");
		if(dto!=null) {
			if(dto.getName().length()>=3) {
				System.out.println("Name is Valid ");
				if(dto.getNoOfSeats()>=100) {
					System.out.println("Number of Seats are Valid");
					repo.save(dto);
				}
				else {
					System.out.println("Number of Seats Not Valid");
				}
			}
			else {
				System.out.println("Name is not Valid");
			}
		}
		return true;
	}
	
	

}
