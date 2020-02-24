package com.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.student.bo.StudentBO;

public class HibernateConfig {

	private static SessionFactory sessionFactory = new Configuration()
													.configure()
													.addAnnotatedClass(StudentBO.class)
													.buildSessionFactory();
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
