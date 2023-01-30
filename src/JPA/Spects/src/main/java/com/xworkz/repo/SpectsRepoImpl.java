package com.xworkz.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.dto.SpectsDto;

public class SpectsRepoImpl implements SpectsRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("spects_database");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction transaction = entityManager.getTransaction();

	public boolean create(SpectsDto dto) {
		if (entityManager != null) {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
//			entityManager.close();
			return true;
		}
		return false;
	}

	public List<SpectsDto> readAll() {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("readAll", SpectsDto.class);
			List list = namedQuery.getResultList();
			transaction.commit();
			return list;

		}
		return null;
	}

	public SpectsDto findByShapeAndPrice(String shape, int price) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("findByShapeAndPrice", SpectsDto.class);
			namedQuery.setParameter("sh", shape);
			namedQuery.setParameter("pr", price);
			transaction.commit();
			return (SpectsDto) namedQuery.getSingleResult();

		}
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("updatePriceByName");
			namedQuery.setParameter("pr", price);
			namedQuery.setParameter("na", name);
			namedQuery.executeUpdate();
			transaction.commit();
			return true;
		}
		return false;
	}

	public boolean updateColorByPriceAndShape(String color, int price, String shape) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("updateColorByPriceAndShape");
			namedQuery.setParameter("col", color);
			namedQuery.setParameter("pr", price);
			namedQuery.setParameter("sh", shape);
			namedQuery.executeUpdate();
			transaction.commit();
			return true;
		}

		return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("deleteByPriceAndColor");
			namedQuery.setParameter("pr", price);
			namedQuery.setParameter("col", color);
			namedQuery.executeUpdate();
			transaction.commit();
			return true;
		}
		return false;
	}

	public boolean deleteByNameAndId(String name, int id) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("deleteByNameAndId");
			namedQuery.setParameter("na", name);
			namedQuery.setParameter("id", id);
			namedQuery.executeUpdate();
			transaction.commit();
			return true;
		}
		return false;
	}

}
