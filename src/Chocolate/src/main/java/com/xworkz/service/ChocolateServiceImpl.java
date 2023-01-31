package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.ChocolateDto;
import com.xworkz.repo.ChocolateRepo;
import com.xworkz.repo.ChocolateRepoImpl;

public class ChocolateServiceImpl implements ChocolateService {

	ChocolateRepo repo = new ChocolateRepoImpl();

	public boolean create(ChocolateDto dto) {
		if (dto != null) {
			if (dto.getId() > 0 && dto.getName().length() >= 2 && dto.getPrice() >= 10 && dto.getColor().length() >= 2
					&& dto.getWeight() >= 20)
				;
			return repo.create(dto);

		}
		return false;
	}

	public List<ChocolateDto> readAll() {
		return repo.readAll();
	}

	public ChocolateDto findByColorAndWeight(String color, int weight) {
		if (color != null && color.length() >= 2 && weight >= 30) {
			return repo.findByColorAndWeight(color, weight);
		}
		return null;
	}

	public ChocolateDto findByPriceAndName(int price, String name) {
		if (price >= 10 && name != null && name.length() >= 2) {
			return repo.findByPriceAndName(price, name);
		}
		return null;
	}

	public boolean updateWeightByNameAndColor(int weight, String name, String color) {
		if (weight >= 30 && name != null && name.length() >= 2 && color != null && color.length() >= 2) {
			return repo.updateWeightByNameAndColor(weight, name, color);
		}
		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, int weight) {
		if (name != null && name.length() >= 2 && id > 0 && weight >= 30) {
			return repo.updateNameByIdAndWeight(name, id, weight);
		}
		return false;
	}

	public boolean deleteByColorAndName(String color, String name) {
		if (color != null && color.length() >= 2 && name != null && name.length() >= 2) {
			return repo.deleteByColorAndName(color, name);
		}
		return false;
	}

}
