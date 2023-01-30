package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.SpectsDto;

public interface SpectsService {

	public boolean create(SpectsDto dto);

	public List<SpectsDto> readAll();

	public SpectsDto findByShapeAndPrice(String shape, int price);

	public boolean updatePriceByName(int price, String name);

	public boolean updateColorByPriceAndShape(String color, int price, String shape);

	public boolean deleteByPriceAndColor(int price, String color);

	public boolean deleteByNameAndId(String name, int id);
}
