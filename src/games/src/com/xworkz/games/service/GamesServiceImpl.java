package com.xworkz.games.service;

import java.util.List;

import com.xworkz.games.dto.GamesDto;
import com.xworkz.games.repo.GamesRepo;
import com.xworkz.games.repo.GamesRepoImpl;

public class GamesServiceImpl implements GamesService {

	GamesRepo repo = new GamesRepoImpl();

	@Override
	public boolean save(GamesDto dto) {
		System.out.println("Data Validating and Sending to Repo..");
		if (dto != null && dto.getName().length() >= 2 && dto.getNoOfPlayers() >= 6
				&& dto.getCountryOriginated().length() >= 2 && dto.getOriginatedYear() >= 1860
				&& dto.getSkillsGained().length() >= 3) {
			System.out.println("All the Data Present is Valid");
			return repo.save(dto);

		} else {
			System.out.println("Invalid Data");
		}
		return false;
	}

	@Override
	public List<GamesDto> read() {
		System.out.println("Data Validating and Sending to Repo.....");
		return repo.read();
	}

	@Override
	public GamesDto findByName(String name) {
		System.out.println("Data saving to Database");
		List<GamesDto> read = repo.read();
		for(GamesDto dto : read)
			if(dto!=null && dto.getName().length()>=2 && dto.getName().equals(name)) {
				return dto;
			}
		return null;
	}

	@Override
	public boolean updateNameByIndex(String name, int index) {
		System.out.println("Data saving to Repo..");
		if(name!=null && name.length()>=2 && index>=0) {
			return repo.updateNameByIndex(name,index);
		}
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data validating ");
		if(index>=0) {
			return repo.deleteByIndex(index);
		}
		return false;
	}

	@Override
	public boolean updateNameByNoOfPlayers(String name, int noOfPlayers) {
		System.out.println("Data Validating.....");
		if(name!=null && name.length()>=0 && noOfPlayers>0 && noOfPlayers<15) {
			 boolean update = repo.updateNameByNoOfPlayers(name,noOfPlayers);
			 return update;
		}
		return false;
	}

	@Override
	public boolean deleteNameByNoOfPlayers(String name, int noOfPlayers) {
		System.out.println("Data Validating...");
		if(name!=null && name.length()>=0 && noOfPlayers>0 && noOfPlayers<15) {
			boolean delete = repo.deleteNameByNoOfPlayers(name,noOfPlayers);
			return delete;
		}
			
				
		return false;

	}

}
