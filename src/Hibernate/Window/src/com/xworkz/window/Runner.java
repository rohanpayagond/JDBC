package com.xworkz.window;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.window.config.WindowConfig;
import com.xworkz.window.dto.WindowDto;

public class Runner {

	public static void main(String[] args) {

		WindowDto dto = new WindowDto(1, "Blue", 3000, "Glazed", 5);
		WindowDto dto1 = new WindowDto(2, "Yellow", 2200, "Sash", 1);
		WindowDto dto2 = new WindowDto(3, "Green", 2500, "Dormer", 3);
		WindowDto dto3 = new WindowDto(4, "Blue", 1800, "Skylight", 4);
		WindowDto dto4 = new WindowDto(5, "Red", 3500, "Bay", 2);

		Session session = WindowConfig.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

//		session.save(dto);
//		session.save(dto1);
//		session.save(dto2);
//		session.save(dto3);
//		session.save(dto4);

//		System.out.println(session.get(WindowDto.class, 2));

		Criteria criteria = session.createCriteria(WindowDto.class);
		List list = criteria.list();
		System.out.println(list);

		transaction.commit();
		session.close();
	}

}
