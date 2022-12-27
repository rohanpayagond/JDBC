package com.xworkz.service;

import java.util.List;

import com.xworkz.bikedto.BikeDto;
import com.xworkz.repo.BikeRepo;
import com.xworkz.repo.BikeRepoImpl;

public class BikeServiceImpl implements BikeService {

	BikeRepo repo = new BikeRepoImpl();
	
	@Override
	public boolean save(BikeDto dto) {
		System.out.println("Data Validating......Sending to Repo");
		if(dto!=null && dto.getName().length()>=0) {
			System.out.println("Name is Valid");
			if(dto.getColor().length()>=0 && dto!=null) {
				System.out.println("Valid Color");
				if(dto.getGears()>=2) {
					System.out.println("Valid Gears");
					if(dto.getPrice()>=72000) {
						System.out.println("Valid Price");
						return repo.save(dto);
					}
					else {
						System.out.println("Invalid Price");
					}
				}else {
					System.out.println("Invalid Gears");
				}
			}else {
				System.out.println("Invalid Color");
			}
		}
		else {
			System.out.println("Invalid Name");
		}
		return true;
	}

	@Override
	public List<BikeDto> read() {
		System.out.println("Data being Validated........");
		return repo.read();
	}

	@Override
	public BikeDto findByName(String name) {
		System.out.println("Data Validating................");
		List<BikeDto> read = repo.read();
		for(BikeDto dto : read)
			if(dto!=null && dto.getName().length()>=0 && dto.getName().equals(name)) {
				return dto;
			}else {
				System.out.println("Data invalid");
			}
		return null;
	}

	@Override
	public boolean updateNameByIndex(String name, int index) {
		System.out.println("Data Validating,...............");
		if(name!=null && name.length()>=0 && index>=0) {
			System.out.println("Data Valid sending to Repo........");
			return repo.updateNameByIndex(name, index);
		}
		
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		if(index>=0) {
			System.out.println("data sending to repo");
			return repo.deleteByIndex(index);
		}
		return false;
	}

	

	

}
