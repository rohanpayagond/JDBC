package com.xworkz.pencil.dto;

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
@Getter
@Setter
@ToString
@Entity
@Table(name = "pencil")
public class PencilDto {

	@Id
	private int id;
	private String brand;
	private int price;
	private String color;
	private String type;

}
