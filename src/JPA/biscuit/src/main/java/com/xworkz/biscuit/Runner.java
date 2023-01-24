package com.xworkz.biscuit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.biscuit.dto.BiscuitDto;

public class Runner {

	public static void main(String[] args) {

		BiscuitDto dto = new BiscuitDto(1, "Britania", 50, 125, "Brown");
		BiscuitDto dto1 = new BiscuitDto(2, "Marie", 10, 100, "White");
		BiscuitDto dto2 = new BiscuitDto(3, "Sunfeast", 15, 115, "Golden");
		BiscuitDto dto3 = new BiscuitDto(4, "Parle", 75, 95, "Red");
		BiscuitDto dto4 = new BiscuitDto(5, "Bourbon", 80, 90, "Yellow");
		BiscuitDto dto5 = new BiscuitDto(6, "Wafer", 55, 88, "Red");
		BiscuitDto dto6 = new BiscuitDto(7, "Anzac", 40, 150, "Blackish-White");
		BiscuitDto dto7 = new BiscuitDto(8, "Peak", 35, 170, "Golden-Brown");
		BiscuitDto dto8 = new BiscuitDto(9, "Cadbury", 65, 180, "Black");
		BiscuitDto dto9 = new BiscuitDto(10, "Dairy Milk", 25, 215, "Blackish-Red");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

//		entityManager.persist(dto);
//		entityManager.persist(dto1);
//		entityManager.persist(dto2);
//		entityManager.persist(dto3);
//		entityManager.persist(dto4);
//		entityManager.persist(dto5);
//		entityManager.persist(dto6);
//		entityManager.persist(dto7);
//		entityManager.persist(dto8);
//		entityManager.persist(dto9);

//		System.out.println(entityManager.find(BiscuitDto.class, 5));

//		BiscuitDto find = entityManager.find(BiscuitDto.class, 8);
//		find.setBrand("Hobnob");
//		entityManager.merge(find);

		BiscuitDto find2 = entityManager.find(BiscuitDto.class, 2);
		entityManager.remove(find2);

		transaction.commit();
	}

}
