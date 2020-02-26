package com.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.student.bo.StudentBO;
import com.user.bo.UserBO;

public class HibernateConfig {

	private static SessionFactory sessionFactory = new Configuration()
													.configure()
													.addAnnotatedClass(StudentBO.class)
													.addAnnotatedClass(UserBO.class)
													.buildSessionFactory();
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
