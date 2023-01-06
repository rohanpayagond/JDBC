package com.xworkz.television.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TelevisionDto {

	private String name;
	private int price;
	private String type;
	private String color;
	private int size;

}
