package com.xworkz.bag.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BagDto {

	private int id;
	private String name;
	private String color;
	private double price;
	private int capacity;

}
