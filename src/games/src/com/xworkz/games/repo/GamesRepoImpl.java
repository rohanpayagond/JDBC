package com.xworkz.games.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.games.dto.GamesDto;

public class GamesRepoImpl implements GamesRepo {

	List<GamesDto> list = new ArrayList<GamesDto>();

	@Override
	public boolean save(GamesDto dto) {
		System.out.println("Data Saving to Database.");
		list.add(dto);
		return true;
	}

	@Override
	public List<GamesDto> read() {
		System.out.println("Data Saving to Database....");
		return list;
	}

	@Override
	public GamesDto findByName(String name) {
		System.out.println("Data saving to Database..");
		return null;
	}

	@Override
	public boolean updateNameByIndex(String name, int index) {
		System.out.println("Data saving to Database");
		GamesDto games = list.get(index);
		games.setName(name);
		list.set(index, games);
		return true;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data saving to Database...");
		list.remove(index);
		return true;
	}

	@Override
	public boolean updateNameByNoOfPlayers(String name, int noOfPlayers) {
		for (int i = 0; i < list.size(); i++) {
			GamesDto dto = list.get(i);
			if (dto.getNoOfPlayers() == noOfPlayers) {
				dto.setName(name);
				list.set(i, dto);
				return true;
			}

		}
		return false;
	}

	@Override
	public boolean deleteNameByNoOfPlayers(String name, int noOfPlayers) {
		ListIterator<GamesDto> itr = list.listIterator();
		return false;

}
}
