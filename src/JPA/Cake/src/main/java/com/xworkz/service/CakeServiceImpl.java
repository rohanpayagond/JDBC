package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.CakeDto;
import com.xworkz.repo.CakeRepo;
import com.xworkz.repo.CakeRepoImpl;

public class CakeServiceImpl implements CakeService {

	CakeRepo repo = new CakeRepoImpl();

	public boolean save(CakeDto dto) {
		if (dto != null) {
			if (dto.getId() > 0 && dto.getName().length() >= 2 && dto.getPrice() >= 10 && dto.getType().length() >= 2
					&& dto.getColor().length() >= 2) {
				System.out.println("Data is Valid, Sending to Repo.");
				return repo.save(dto);
			}
		}
		return false;
	}

	public CakeDto findById(int id) {
		if (id > 0) {
			System.out.println("Data Valid ..");
			return repo.findById(id);
		}
		return null;
	}

	public boolean updateColorById(String color, int id) {
		if (id > 0 && color.length() >= 2) {
			System.out.println("Update Method is Valid...");
			return repo.updateColorById(color, id);
		}
		return false;
	}

	public boolean deleteById(int id) {
		if (id > 0) {
			System.out.println("Delete Method is Valid....");
			return repo.deleteById(id);
		}
		return false;
	}

}
