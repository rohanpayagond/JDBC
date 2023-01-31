package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.ChocolateDto;

public interface ChocolateService {

	public boolean create(ChocolateDto dto);

	public List<ChocolateDto> readAll();

	public ChocolateDto findByColorAndWeight(String color, int weight);

	public ChocolateDto findByPriceAndName(int price, String name);

	public boolean updateWeightByNameAndColor(int weight, String name, String color);

	public boolean updateNameByIdAndWeight(String name, int id, int weight);

	public boolean deleteByColorAndName(String color, String name);

}
