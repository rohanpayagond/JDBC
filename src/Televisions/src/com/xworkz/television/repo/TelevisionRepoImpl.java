package com.xworkz.television.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public class TelevisionRepoImpl implements TelevisionRepo {

	List<TelevisionDto> list = new ArrayList<TelevisionDto>();

	@Override
	public boolean save(TelevisionDto dto) {
		list.add(dto);
		System.out.println("Data Saving to Database.");
		return true;
	}

	@Override
	public List<TelevisionDto> read() {
		System.out.println("Data Saving to Database..");
		return list;
	}

	@Override
	public TelevisionDto findByNameAndSize(String name, int size) {
		System.out.println("Saving to Database...");
		return null;
	}

	@Override
	public TelevisionDto findTypeAndColorByIndex(String type, String color, int index) {
		System.out.println("Saving Data to the Database....");
		return null;
	}

	@Override
	public boolean updateSizeByType(int size, String type) {
		for (int i = 0; i < list.size(); i++) {
			TelevisionDto dto = list.get(i);
			if(dto.getType().equals(type)) {
				dto.setSize(size);
				list.set(i, dto);
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndColor(String name, String color) {
		Iterator<TelevisionDto> itr = list.iterator();
		while(itr.hasNext()){
			TelevisionDto next = itr.next();
			if(next.getName().equals(name) && next.getColor().equals(color)) {
				itr.remove();
			}
		}
		return true;
	}

}
