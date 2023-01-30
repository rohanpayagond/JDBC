package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.repo.BulbRepo;
import com.xworkz.bulb.repo.BulbRepoImpl;

public class BulbServiceImpl implements BulbService {

	BulbRepo repo = new BulbRepoImpl();

	public boolean create(BulbDto dto) {
		if (dto != null) {
			if (dto.getName().length() >= 2 && dto.getId() > 0 && dto.getPrice() >= 50 && dto.getSize().length() >= 2
					&& dto.getType().length() >= 2) {
				return repo.create(dto);
			}
		}
		return false;
	}

	public List<BulbDto> readAll() {
		return repo.readAll();
	}

	public BulbDto findByName(String name) {
		if (name != null && name.length() >= 2 && name.equalsIgnoreCase(name)) {
			return repo.findByName(name);
		}
		return null;
	}

	public BulbDto findBySize(String size) {
		if (size != null && size.length() >= 2 && size.equalsIgnoreCase(size)) {
			return repo.findBySize(size);
		}
		return null;
	}

	public BulbDto findByPrice(int price) {
		if (price >= 50) {
			return repo.findByPrice(price);
		}
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
		if (name != null && name.length() >= 2 && name.equalsIgnoreCase(name) && price >= 50) {
			return repo.updatePriceByName(price, name);
		}
		return false;
	}

	public boolean updateNameBySizeAndPrice(String name, String size, int price) {
		if (name != null && name.length() >= 2 && size != null && size.length() >= 2 && price > 85) {
			repo.updateNameBySizeAndPrice(name, size, price);
		}
		return false;
	}

	public boolean deleteByNameAndPrice(String name, int price) {
		if (name != null && name.length() >= 2 && price > 85) {
			return repo.deleteByNameAndPrice(name, price);
		}
		return false;
	}

}
