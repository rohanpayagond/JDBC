package com.xworkz;

import java.util.List;

import com.xworkz.mobile.MobileDto;
import com.xworkz.service.MobileService;
import com.xworkz.service.MobileServiceImpl;

public class Runner {

	public static void main(String[] args) {

		MobileDto dto = new MobileDto("Realme", 18999, "Black", 5000, 128);
		MobileDto dto1 = new MobileDto("Oneplus", 25999, "Blue", 5500, 256);
		MobileDto dto2 = new MobileDto("Samsung", 20999, "Silver", 4300, 256);
		MobileDto dto3 = new MobileDto("Vivo", 15999, "Green", 4000, 128);
		MobileDto dto4 = new MobileDto("Apple", 69999, "Red", 3800, 128);

		MobileService service = new MobileServiceImpl();

		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);

		List<MobileDto> read = service.read();
		for (MobileDto data : read)
			System.out.println(data);

		MobileDto findByBrand = service.findByBrand("Samsung");
		System.out.println(findByBrand);

		boolean update = service.updateBrandByIndex("Huawei", 4);
		System.out.println(update);

		List<MobileDto> read2 = service.read();
		for (MobileDto mob : read2)
			System.out.println(mob);

		boolean delete = service.deleteByIndex(0);
		System.out.println(delete);

		List<MobileDto> read3 = service.read();
		for (MobileDto mob : read3)
			System.out.println(mob);

	}

}
