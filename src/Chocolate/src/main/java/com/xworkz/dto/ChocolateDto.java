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
@Table(name = "chocolate")
@NamedQuery(name = "readAll", query = "select choco from ChocolateDto choco")
@NamedQuery(name = "findByColorAndWeight", query = "select choco from ChocolateDto choco where choco.color=:col and choco.weight=:wg")
@NamedQuery(name = "findByPriceAndName", query = "select choco from ChocolateDto choco where choco.price=:pr and choco.name=:na")
@NamedQuery(name = "updateWeightByNameAndColor", query = "update ChocolateDto choco set choco.weight=:wg where choco.name=:na and choco.color=:col")
@NamedQuery(name = "updateNameByIdAndWeight", query = "update ChocolateDto choco set choco.name=:na where choco.id=:no and choco.weight=:wg")
@NamedQuery(name = "deleteByColorAndName", query = "delete from ChocolateDto choco where choco.color=:col and choco.name=:na")
public class ChocolateDto {

	@Id
	private int id;
	private String name;
	private int price;
	private String color;
	private int weight;

}
