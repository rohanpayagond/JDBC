package com.xworkz.dto;

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
@Table(name = "spects")
@NamedQuery(name = "readAll", query = "select spects from SpectsDto spects")
@NamedQuery(name = "findByShapeAndPrice", query = "select spects from SpectsDto spects where spects.shape=:sh and spects.price=:pr")
@NamedQuery(name = "updatePriceByName", query = "update SpectsDto spects set spects.price=:pr where spects.name=:na")
@NamedQuery(name = "updateColorByPriceAndShape", query = "update SpectsDto spects set spects.color=:col where spects.price=:pr and spects.shape=:sh")
@NamedQuery(name = "deleteByPriceAndColor", query = "delete from SpectsDto spects where spects.price=:pr and spects.color=:col")
@NamedQuery(name = "deleteByNameAndId", query = "delete from SpectsDto spects where spects.name=:na and spects.id=:id")
public class SpectsDto {

	@Id
	private int id;
	private String name;
	private String color;
	private String shape;
	private int price;

}
