package com.xworkz.television.service;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;
import com.xworkz.television.repo.TelevisionRepo;
import com.xworkz.television.repo.TelevisionRepoImpl;

public class TelevisionServiceImpl implements TelevisionService {

	TelevisionRepo repo = new TelevisionRepoImpl();

	@Override
	public boolean save(TelevisionDto dto) {
		if (dto != null && dto.getName().length() >= 2 && dto.getPrice() >= 15000 && dto.getColor().length() >= 2) {
			System.out.println("Save Method in Service.");
			return repo.save(dto);
		}
		return false;
	}

	@Override
	public List<TelevisionDto> read() {
		System.out.println("Read Method in Service..");
		return repo.read();
	}

	@Override
	public TelevisionDto findByNameAndSize(String name, int size) {
		List<TelevisionDto> read = repo.read();
		for (TelevisionDto dto : read) {
			if (dto != null && dto.getName().equals(name) && dto.getName().length() >= 2 && dto.getSize() >= 25) {
				System.out.println("FindByName Method in Service...");
				return dto;
			}
		}
		return null;
	}

	@Override
	public TelevisionDto findTypeAndColorByIndex(String type, String color, int index) {
		List<TelevisionDto> read = repo.read();
		for (TelevisionDto dto : read) {
			if (dto != null && dto.getColor().equals(color) && dto.getType().equals(type) && index >= 0) {
				System.out.println("FindTypeAndColor Method in Service...");
				return dto;
			}
		}
		return null;
	}

	@Override
	public boolean updateSizeByType(int size, String type) {
		if (size >= 25 && size != 0 && type.length() >= 1) {
			System.out.println("UpdateSize Method in Service...");
			return repo.updateSizeByType(size, type);
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndColor(String name, String color) {
		if (name != null && name.length() >= 2 && color != null && color.length() >= 2 && name.equalsIgnoreCase(name)
				&& color.equalsIgnoreCase(color)) {
			System.out.println("Delete Method in Service....");
			return repo.deleteByNameAndColor(name, color);
		}
		return false;
	}

}
