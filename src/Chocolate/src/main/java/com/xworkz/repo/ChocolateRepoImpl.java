package com.xworkz.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.dto.ChocolateDto;

public class ChocolateRepoImpl implements ChocolateRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chocolate_database");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction transaction = entityManager.getTransaction();

	public boolean create(ChocolateDto dto) {
		if (entityManager != null) {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
//			entityManager.close();
		}
		return false;
	}

	public List<ChocolateDto> readAll() {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("readAll", ChocolateDto.class);
			List list = namedQuery.getResultList();
			transaction.commit();
			return list;
		}
		return null;
	}

	public ChocolateDto findByColorAndWeight(String color, int weight) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("findByColorAndWeight", ChocolateDto.class);
			namedQuery.setParameter("col", color);
			namedQuery.setParameter("wg", weight);
			Object result = namedQuery.getSingleResult();
			transaction.commit();
			return (ChocolateDto) result;

		}
		return null;
	}

	public ChocolateDto findByPriceAndName(int price, String name) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("findByPriceAndName", ChocolateDto.class);
			namedQuery.setParameter("pr", price);
			namedQuery.setParameter("na", name);
			Object result = namedQuery.getSingleResult();
			transaction.commit();
			return (ChocolateDto) result;
		}
		return null;
	}

	public boolean updateWeightByNameAndColor(int weight, String name, String color) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("updateWeightByNameAndColor");
			namedQuery.setParameter("wg", weight);
			namedQuery.setParameter("na", name);
			namedQuery.setParameter("col", color);
			namedQuery.executeUpdate();
			transaction.commit();
			return true;
		}
		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, int weight) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("updateNameByIdAndWeight");
			namedQuery.setParameter("na", name);
			namedQuery.setParameter("no", id);
			namedQuery.setParameter("wg", weight);
			namedQuery.executeUpdate();
			transaction.commit();
			return true;

		}
		return false;
	}

	public boolean deleteByColorAndName(String color, String name) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("deleteByColorAndName");
			namedQuery.setParameter("col", color);
			namedQuery.setParameter("na", name);
			namedQuery.executeUpdate();
			transaction.commit();
			return true;

		}
		return false;
	}

}
