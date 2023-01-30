package com.xworkz.bulb.dto;

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
@Table(name = "bulb")
@NamedQuery(name = "readAll", query = "select bulb from BulbDto bulb")
@NamedQuery(name = "findByName", query = "select bulb from BulbDto bulb where bulb.name=:find")
@NamedQuery(name = "findBySize", query = "select bulb from BulbDto bulb where bulb.size=:find")
@NamedQuery(name = "findByPrice", query = "select bulb from BulbDto bulb where bulb.price=:find")
@NamedQuery(name = "updatePriceByName", query = "update BulbDto bulb set bulb.price=:pr where bulb.name=:na")
@NamedQuery(name = "updateNameBySizeAndPrice", query = "update BulbDto bulb set bulb.name=:na where bulb.size=:si and bulb.price=:pr")
@NamedQuery(name = "deleteByNameAndPrice", query = "delete from BulbDto bulb where bulb.name=:na and bulb.price=:pr")
public class BulbDto {

	@Id
	private int id;
	private String name;
	private int price;
	private String type;
	private String size;

}
