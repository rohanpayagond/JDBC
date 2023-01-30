package com.xworkz.watch.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
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
@Table(name = "watch")
//@NamedQuery(name = "readAll", query = "select watch from WatchDto watch")
@NamedQuery(name = "findByBrand", query = "select watch from WatchDto watch where watch.brand=:find")
public class WatchDto {

	@Id
	private int id;
	private String brand;
	private int price;
	private String color;
	private int density;

}
