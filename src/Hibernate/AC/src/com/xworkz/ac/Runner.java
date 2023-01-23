package com.xworkz.ac;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.ac.config.ACConfig;
import com.xworkz.ac.dto.ACDto;

public class Runner {

	public static void main(String[] args) {

		ACDto dto = new ACDto(1, "Godrej", 15000, "Central", "Fibre");
		ACDto dto1 = new ACDto(2, "Voltas", 18000, "Window", "Aluminium");
		ACDto dto2 = new ACDto(3, "Daikin", 12000, "Ductless", "Metal");
		ACDto dto3 = new ACDto(4, "Videocon", 10000, "Portable", "Polythene");
		ACDto dto4 = new ACDto(5, "Hitachi", 8000, "Floor Mounted", "Plastic");

		Session session = ACConfig.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

//		session.save(dto);
//		session.save(dto1);
//		session.save(dto2);
//		session.save(dto3);
//		session.save(dto4);

//		System.out.println(session.get(ACDto.class, 3));

		Criteria criteria = session.createCriteria(ACDto.class);
		List list = criteria.list();
		for (Object object : list) {
			System.out.println(object);
		}

		transaction.commit();
		session.close();
	}

}
