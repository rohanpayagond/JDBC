package com.xworkz.car.dto;

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

public class CarDto {

	private String brand;
	private double price;
	private String color;
	private String type;
	private int speed;
}
