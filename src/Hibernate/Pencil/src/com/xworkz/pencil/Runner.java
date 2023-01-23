package com.xworkz.pencil;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pencil.config.PencilConfig;
import com.xworkz.pencil.dto.PencilDto;

public class Runner {

	public static void main(String[] args) {

		PencilDto dto = new PencilDto(1, "Nataraj", 10, "Red", "HB");
		PencilDto dto1 = new PencilDto(2, "Apsara", 20, "Grey", "2HB");
		PencilDto dto2 = new PencilDto(3, "Camlin", 30, "Yellow", "5HB");
		PencilDto dto3 = new PencilDto(4, "Doms", 25, "Brown", "HHB");
		PencilDto dto4 = new PencilDto(5, "Linc", 35, "Black", "2H");

		Session session = PencilConfig.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

//		session.save(dto);
//		session.save(dto1);
//		session.save(dto2);
//		session.save(dto3);
//		session.save(dto4);

//		System.out.println(session.get(PencilDto.class, 3)); 		// find by id

		Criteria criteria = session.createCriteria(PencilDto.class); 		// read all
		List<PencilDto> list = criteria.list();
		System.out.println(list);

		transaction.commit();
//		session.close();

	}

}
