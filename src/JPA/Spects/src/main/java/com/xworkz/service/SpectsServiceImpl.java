package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.SpectsDto;
import com.xworkz.repo.SpectsRepo;
import com.xworkz.repo.SpectsRepoImpl;

public class SpectsServiceImpl implements SpectsService {

	SpectsRepo repo = new SpectsRepoImpl();

	public boolean create(SpectsDto dto) {
		if (dto != null) {
			if (dto.getName().length() >= 2 && dto.getColor().length() >= 2 && dto.getId() > 0 && dto.getPrice() > 500
					&& dto.getShape().length() >= 2) {
				return repo.create(dto);
			}

		}
		return false;
	}

	public List<SpectsDto> readAll() {
		return repo.readAll();
	}

	public SpectsDto findByShapeAndPrice(String shape, int price) {
		if (shape != null && shape.length() >= 2 && shape.equalsIgnoreCase(shape) && price >= 500) {
			return repo.findByShapeAndPrice(shape, price);
		}
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
		if (price > 500 && name.length() >= 2 && name.equalsIgnoreCase(name)) {
			return repo.updatePriceByName(price, name);
		}
		return false;
	}

	public boolean updateColorByPriceAndShape(String color, int price, String shape) {
		if (color != null && color.length() >= 2 && price > 500 && shape != null && shape.length() >= 2) {
			return repo.updateColorByPriceAndShape(color, price, shape);
		}
		return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if (price > 500 && color != null && color.length() >= 2) {
			return repo.deleteByPriceAndColor(price, color);
		}
		return false;
	}

	public boolean deleteByNameAndId(String name, int id) {
		if (name != null && name.length() >= 2 && id > 0) {
			return repo.deleteByNameAndId(name, id);
		}
		return false;
	}

}
