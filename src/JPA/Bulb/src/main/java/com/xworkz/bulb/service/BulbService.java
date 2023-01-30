package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;

public interface BulbService {

	public boolean create(BulbDto dto);

	public List<BulbDto> readAll();

	public BulbDto findByName(String name);

	public BulbDto findBySize(String size);

	public BulbDto findByPrice(int price);

	public boolean updatePriceByName(int price, String name);

	public boolean updateNameBySizeAndPrice(String name, String size, int price);

	public boolean deleteByNameAndPrice(String name, int price);
}
