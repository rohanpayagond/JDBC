package com.xworkz.service;

import java.util.List;

import com.xworkz.main.TheatreDto;
import com.xworkz.repo.TheatreRepo;
import com.xworkz.repo.TheatreRepoImpl;

public class TheatreServiceImpl implements TheatreService {

	TheatreRepo repo = new TheatreRepoImpl();

	@Override
	public boolean save(TheatreDto dto) {
		System.out.println("Validated and Saved and sending to Repo");
		if (dto != null) {
			if (dto.getName().length() >= 3) {
				System.out.println("Name is Valid ");
				if (dto.getNoOfSeats() >= 100) {
					System.out.println("Number of Seats are Valid");
					repo.save(dto);
				} else {
					System.out.println("Number of Seats Not Valid");
				}
			} else {
				System.out.println("Name is not Valid");
			}
		}
		return true;
	}

	@Override
	public List<TheatreDto> read() {
		return repo.read();

	}

	@Override
	public TheatreDto findByName(String name) {
		if (name != null) {
			if (name.length() >= 3) {
				System.out.println("Name is Valid");
				return repo.findByName(name);
			}
		} 
		else {
			System.out.println("Name not Found");
		}
		return null;
	}

	@Override
	public TheatreDto findBynoOfWorkers(int noOfWorkers) {
		if (noOfWorkers != 0) {
			if (noOfWorkers <= 25) {
				System.out.println("No of Workers is Valid");
				return repo.findBynoOfWorkers(noOfWorkers);
			}
			else {
				System.out.println("No of Workers Not Valid");
			}
		}
		return null;
	}

	@Override
	public List<TheatreDto> findByAffordable(boolean affordable) {
		if(affordable==true) {
			System.out.println("Valid");
			return repo.findByAffordable(affordable);
		}
		return null;
	}

	@Override
	public TheatreDto delete(String name) {
		if(name!=null) {
			if(name.length()<=15) {
				System.out.println("Data is Valid");
				return repo.delete(name);
			}
		}
		return null;
	}

	
	
}
