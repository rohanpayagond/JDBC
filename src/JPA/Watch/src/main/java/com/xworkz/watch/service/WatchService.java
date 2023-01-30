package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchService {

	public boolean create(WatchDto dto);

	public List<WatchDto> readAll();

	public WatchDto findByBrand(String brand);

}
