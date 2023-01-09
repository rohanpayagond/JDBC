package com.xworkz.tree.dto;

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
public class TreeDto {

	private String name;
	private String type;
	private String location;
	private int height;
	private String typeOfLeaf;
	private String shapeOfLeaf;
	private int width;
	private int age;
	private boolean fruitBearing;
	private boolean flowerBearing;

}
