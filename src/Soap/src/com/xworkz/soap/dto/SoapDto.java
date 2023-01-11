package com.xworkz.soap.dto;

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
public class SoapDto {

	private int id;
	private String name;
	private int price;
	private String color;
	private String fragrance;
	private double weight;
	private int manufacturedDate;
	private String type;

}
