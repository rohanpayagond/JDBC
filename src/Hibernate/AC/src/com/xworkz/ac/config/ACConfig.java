package com.xworkz.ac.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.ac.dto.ACDto;

public class ACConfig {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		Configuration configuration = new Configuration();

		Properties properties = new Properties();

		if (sessionFactory == null) {

			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hubli");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.SHOW_SQL, true);
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		//	properties.put(Environment.HBM2DDL_AUTO, "create-drop");

			configuration.setProperties(properties);
			configuration.addAnnotatedClass(ACDto.class);

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			return sessionFactory;
		}

		return null;

	}

}
