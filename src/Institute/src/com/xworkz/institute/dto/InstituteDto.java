package com.xworkz.institute.dto;

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
public class InstituteDto {

	private String name;
	private String location;
	private int noOfTrainers;
	private int noOfStudents;
	private String course;
	private double rating;

}
