package com.springboot.app.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.springboot.app.config.HibernateConfigUtil;
import com.springboot.app.domain.Category;

public class CategoryDao {

	public Category getCategoryById(Integer id) {
		Session session = null;
		Transaction transaction = null;
		Category category = null;
		try {
			session = HibernateConfigUtil.openSession();
			transaction = session.beginTransaction();
			category = session.get(Category.class, id);
			
			System.out.println(category.getName());
			Thread.sleep(1000);
			
			category = session.get(Category.class, id);
			System.out.println(category.getName());

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return category;
	}
	
	public Category getCategorySecondLevelCache(Integer id) {
		Session session = null;
		Transaction transaction = null;
		Category category = null;
		
		try {
			session = HibernateConfigUtil.openSession();
			transaction = session.beginTransaction();
			category = session.get(Category.class, id);
			
			System.out.println(category.getName());
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		try {
			session = HibernateConfigUtil.openSession();
			transaction = session.beginTransaction();
			category = session.get(Category.class, id);
			
			System.out.println(category.getName());
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return category;
	}
}
