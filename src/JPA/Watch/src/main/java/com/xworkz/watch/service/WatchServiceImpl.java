package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repo.WatchRepo;
import com.xworkz.watch.repo.WatchRepoImpl;

public class WatchServiceImpl implements WatchService {

	WatchRepo repo = new WatchRepoImpl();

	public boolean create(WatchDto dto) {
		if (dto != null) {
			if (dto.getBrand().length() >= 2 && dto.getColor().length() >= 2 && dto.getDensity() > 0 && dto.getId() > 0
					&& dto.getPrice() >= 1000) {
				return repo.create(dto);
			}
		}
		return false;
	}

	public List<WatchDto> readAll() {
		return repo.readAll();
	}

	public WatchDto findByBrand(String brand) {
		if (brand != null && brand.length() >= 2) {
			return repo.findByBrand(brand);
		}
		return null;
	}

}
