package com.student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.configuration.HibernateConfig;
import com.student.bo.StudentBO;
import com.student.servicemetier.StudentServiceTechnique;

public class StudentDAO implements IStudentDAO {

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
		
		public StudentBO getStudentByPk(Long id) {
			try {
				Session session = sessionFactory.getCurrentSession();
				session.beginTransaction();
				StudentBO student = (StudentBO) session.createQuery(" from StudentBO s where s.id= :id").setParameter("id", id).getSingleResult();
				System.out.println(student);
				session.getTransaction().commit();
				return student;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return null;
			
		}
		
		public List<StudentBO> getStudentByAge(Long age){
			return null;
		}
		
		/**
		 * this method look for student greater than an age
		 * @param age
		 * @return
		 */
		public List<StudentBO> getStudentGtAge(Long age){
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Criteria criteria = session.createCriteria(StudentBO.class);
			criteria.add(Restrictions.gt("age", age));
			List<StudentBO> list_student = criteria.list();
			session.close();
			return list_student;
		}
		public static void main(String[] args) {
			StudentBO studentBO = new StudentBO("test","test","test",18L,"test");
			new StudentDAO().testAdd(studentBO);
			new StudentDAO().getStudentByPk(1L);
			for(StudentBO s : new StudentDAO().getStudentGtAge(0L)) {
				System.out.println(s);
			};
		}
}
