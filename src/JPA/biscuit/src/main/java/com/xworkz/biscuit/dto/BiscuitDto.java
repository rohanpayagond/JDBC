package com.xworkz.biscuit.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "biscuit")
public class BiscuitDto {

	@Id
	private int id;
	private String brand;
	private int price;
	private int weight;
	private String color;

}
