package com.xworkz.watch.repo;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchRepo {

	public boolean create(WatchDto dto);

	public List<WatchDto> readAll();

	public WatchDto findByBrand(String brand);

}
