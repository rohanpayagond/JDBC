package com.xworkz.watch.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.watch.dto.WatchDto;

public class WatchRepoImpl implements WatchRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("watch_database");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction transaction = entityManager.getTransaction();

	public boolean create(WatchDto dto) {
		if (entityManager != null) {
//			transaction.begin();
			entityManager.persist(dto);
//			transaction.commit();
//		entityManager.close();
			return true;
		}
		return false;
	}

	public List<WatchDto> readAll() {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("readAll");
			List list = namedQuery.getResultList();
			transaction.commit();
			return list;
		}

		return null;
	}

	public WatchDto findByBrand(String brand) {
		if (entityManager != null) {
			Query namedQuery = entityManager.createNamedQuery("findByBrand");
			Query parameter = namedQuery.setParameter("find", brand);
			Object result = parameter.getSingleResult();
			WatchDto dto = (WatchDto) result;
			
			
			return dto;
		}
		return null;
	}

}