package com.bfs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bfs.config.HibernateConfigUtil;
import com.bfs.domain.Category;
import com.bfs.domain.ProdCatResult;
import com.bfs.domain.Product;

public class ApplicationStater {

	public static void main(String[] args) {
		Session session = HibernateConfigUtil.getCurrentSession();
						
		List<ProdCatResult> results = null;
		Transaction transaction = null;
		
		lazyLoadException();
		
		try {
			
			session = HibernateConfigUtil.getCurrentSession();
			
			//System.out.println("a");
			transaction = session.beginTransaction();

			//System.out.println("b");
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<ProdCatResult> criteriaQuery = criteriaBuilder.createQuery(ProdCatResult.class);
			
			Root<Product> pRoot = criteriaQuery.from(Product.class);
			pRoot.join("category", JoinType.INNER); //0 - cross join; 1- inner join
			criteriaQuery.multiselect(				
					pRoot.get("id"),
					pRoot.get("name"),
					pRoot.get("price"),
					pRoot.get("category").get("id"),
					pRoot.get("category").get("name"));
			Predicate predicate = pRoot.get("category").get("name").in(Arrays.asList("iphone","ipad"));
			criteriaQuery.where(predicate);
			//select p.id, p.name, p.price, c.id as categoryId, c.name as categoryName 
			//from product p inner join category c
			//on p.categoryId = c.id
			//where c.name in ('iphone','ipad')
			
			results = session.createQuery(criteriaQuery).getResultList();
			transaction.commit();
			printResult(results);
		} catch (Exception e) {
			e.printStackTrace();
			results = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
			HibernateConfigUtil.getSessionFactory().close();
		}
	}
	
	private static void printResult(List<ProdCatResult> results) {
		results.forEach(result -> {
			System.out.println("Id: " + result.getId());
			System.out.println("Name: " + result.getName());
			System.out.println("Price: " + result.getPrice());
			System.out.println("Category Id: " + result.getCategoryId());
			System.out.println("Category Name: " + result.getCategoryName());
			System.out.println("=======================");
		});
	}
	
	private static void lazyLoadException() {
		Session session = HibernateConfigUtil.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		Category category = session.get(Category.class, new Integer(1));
		//category.getProducts().isEmpty();
		transaction.commit();
		session.close();
		System.out.println(category.getProducts());
	}
}
