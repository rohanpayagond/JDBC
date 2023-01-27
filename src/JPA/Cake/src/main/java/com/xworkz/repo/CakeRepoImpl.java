package com.xworkz.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.dto.CakeDto;

public class CakeRepoImpl implements CakeRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cake_database");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	public boolean save(CakeDto dto) {
		if (dto != null) {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
//			entityManager.close();
		}

		return false;
	}

	public CakeDto findById(int id) {
		transaction.begin();
		CakeDto find = entityManager.find(CakeDto.class, id);
		transaction.commit();
		return find;
	}

	public boolean updateColorById(String color, int id) {
		transaction.begin();
		CakeDto find = entityManager.find(CakeDto.class, id);
		find.setColor(color);
		entityManager.merge(find);
		transaction.commit();
		return true;
	}

	public boolean deleteById(int id) {
		transaction.begin();
		CakeDto find = entityManager.find(CakeDto.class, id);
		entityManager.remove(find);
		transaction.commit();
		return true;
	}

}
