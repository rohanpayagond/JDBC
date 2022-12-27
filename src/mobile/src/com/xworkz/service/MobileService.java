package com.xworkz.service;

import java.util.List;

import com.xworkz.mobile.MobileDto;

public interface MobileService {

	public boolean save(MobileDto dto);

	public List<MobileDto> read();

	public MobileDto findByBrand(String brand);

	public boolean updateBrandByIndex(String brand, int index);

	public boolean deleteByIndex(int index);


}
