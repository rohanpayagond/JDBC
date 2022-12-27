package com.xworkz.service;

import java.util.List;

import com.xworkz.laptop.LaptopDto;
import com.xworkz.repo.LaptopRepo;
import com.xworkz.repo.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService {

	LaptopRepo repo = new LaptopRepoImpl();

	@Override
	public boolean save(LaptopDto dto) {
		System.out.println("Data is being Validated");
		if (dto != null && dto.getName().length() >= 3) {
			System.out.println("Data is Valid and Sending to Repo");
			repo.save(dto);
		} else {
			System.out.println("Data Inavlid");
		}
		return false;
	}

	@Override
	public List<LaptopDto> read() {
		System.out.println("Data is Validating and sending to Repo");
		return repo.read();
	}

	@Override
	public LaptopDto findByName(String name) {
		List<LaptopDto> read = repo.read();
		for (LaptopDto dto : read) {
			if (name != null) {
				if (dto.getName().equals(name) && dto.getName().length() >= 3) {
					System.out.println("Data being Validated");
					return dto;
				} else {
					System.out.println("Invalid Data");
				}

			}
		}

		return null;
	}

	@Override
	public LaptopDto updateNameByIndex(String name, int index) {
		System.out.println("Data is being Validated");
		if (name != null && name.length() >= 3) {
			LaptopDto update = repo.updateNameByIndex(name, index);
			return update;
		}

		return null;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data is Validating and sending to Repo");
		if(index>=0) {
		boolean delete = deleteByIndex(index);
		}
		return false;
	}

}
