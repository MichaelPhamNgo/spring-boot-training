package com.springboot.app.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.springboot.app.domain.Author;
import com.springboot.app.domain.Category;

public class HibernateConfigUtil {

	private static final SessionFactory sessionFactory;
	
	static {
		try {
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml")
					.build();
			
			Metadata metaData = new MetadataSources(serviceRegistry)
					.addAnnotatedClass(Category.class)
					.addAnnotatedClass(Author.class)
					.getMetadataBuilder()
					.build();
			
			sessionFactory = metaData.getSessionFactoryBuilder().build();
			
		} catch (Exception e) {
			System.err.println("Enitial SessionFactory creation failed" + e.getMessage());
			throw new ExceptionInInitializerError(e);
		}
	}
	
	private HibernateConfigUtil() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static Session openSession() {
		return sessionFactory.openSession();
	}
	
	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}
	
	public static Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public static void closeCurrentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		if (currentSession.isOpen()) {
			currentSession.close();
		}
	}
}
