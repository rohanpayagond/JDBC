package com.xworkz.shoe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShoeDto {
	
	private int id;
	private String brand;
	private int price;
	private String color;
	private String type;

}
