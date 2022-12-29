package com.xworkz.games;

import java.util.List;

import com.xworkz.games.dto.GamesDto;
import com.xworkz.games.service.GamesService;
import com.xworkz.games.service.GamesServiceImpl;

public class Runner {

	public static void main(String[] args) {

		GamesDto dto = new GamesDto("Cricket", 11, "England", 1877,"Physical Strength");
		GamesDto dto1 = new GamesDto("Volleyball", 6, "USA", 1895,"Coordination and Physical");
		GamesDto dto2 = new GamesDto("Foootball", 9, "Britain", 1888,"Fitness");
		GamesDto dto3 = new GamesDto("Kabaddi", 7, "India", 1930,"Coordination");
		GamesDto dto4 = new GamesDto("Kho-Kho", 12, "India", 1914,"Communication ");
		
		GamesService service = new GamesServiceImpl();
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		
		List<GamesDto> read = service.read();
		for(GamesDto reads : read)
			System.out.println(reads);
		
	
		GamesDto find= service.findByName("Kabaddi");
		System.out.println(find);
		
		boolean update = service.updateNameByIndex("Soccer", 2);
		System.out.println(update);
		
		List<GamesDto> read1 = service.read();
		for(GamesDto reads : read1)
			System.out.println(reads);
		
		boolean delete = service.deleteByIndex(0);
		System.out.println(delete);
		
		List<GamesDto> read2 = service.read();
		for(GamesDto reads : read2)
			System.out.println(reads);
		
		boolean updateName = service.updateNameByNoOfPlayers("ThrowBall", 6);
		System.out.println(updateName);
		
		List<GamesDto> read3 = service.read();
		for(GamesDto reads : read3)
			System.out.println(reads);
		
		
	}

}
