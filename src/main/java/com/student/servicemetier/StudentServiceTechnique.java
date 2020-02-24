package com.student.servicemetier;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.configuration.HibernateConfig;
import com.student.bo.StudentBO;

public class StudentServiceTechnique implements IStudentServiceTechnique {

	// spring aop will be used : this code is for testing purposes
	private static SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
	
	public void testAdd(StudentBO studentBO) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.save(studentBO);
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		StudentBO studentBO = new StudentBO("college");
		new StudentServiceTechnique().testAdd(studentBO);
	}
}
