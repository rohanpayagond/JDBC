package com.xworkz.bulb.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.bulb.dto.BulbDto;

public class BulbRepoImpl implements BulbRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bulb_database");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction transaction = entityManager.getTransaction();

	public boolean create(BulbDto dto) {
		if (entityManager != null) {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
//			entityManager.close();
			return true;
		}
		return false;
	}

	public List<BulbDto> readAll() {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("readAll", BulbDto.class);
			List list = namedQuery.getResultList();
			transaction.commit();
			return list;

		}
		return null;
	}

	public BulbDto findByName(String name) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("findByName", BulbDto.class);
			Query parameter = namedQuery.setParameter("find", name);
			Object result = parameter.getSingleResult();
			return (BulbDto) result;
		}
		return null;
	}

	public BulbDto findBySize(String size) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("findBySize", BulbDto.class);
			Query parameter = namedQuery.setParameter("find", size);
			Object result = parameter.getSingleResult();
			return (BulbDto) result;
		}
		return null;
	}

	public BulbDto findByPrice(int price) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("findByPrice", BulbDto.class);
			Query parameter = namedQuery.setParameter("find", price);
			Object result = parameter.getSingleResult();
			return (BulbDto) result;
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
		}
		return false;
	}

	public boolean updateNameBySizeAndPrice(String name, String size, int price) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("updateNameBySizeAndPrice");
			namedQuery.setParameter("na", name);
			namedQuery.setParameter("si", size);
			namedQuery.setParameter("pr", price);
			namedQuery.executeUpdate();
			transaction.commit();
		}
		return false;
	}

	public boolean deleteByNameAndPrice(String name, int price) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("deleteByNameAndPrice");
			namedQuery.setParameter("na", name);
			namedQuery.setParameter("pr", price);
			namedQuery.executeUpdate();
			transaction.commit();
		}
		return false;
	}

}
