package com.xworkz.games.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class GamesDto {
	
	private String name;
	private int noOfPlayers;
	private String countryOriginated;
	private int originatedYear;
	private String skillsGained;
	
	

}
