package com.springboot.app;

import com.springboot.app.config.HibernateConfigUtil;
import com.springboot.app.dao.AuthorDao;
import com.springboot.app.dao.CategoryDao;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

public class ApplicationStarter {

	public static void main(String[] args) {

		//Cache
		CategoryDao dao = new CategoryDao();
		
//		dao.getCategoryById(1);
		
//		dao.getCategorySecondLevelCache(2);
//		
//		Cache cache = CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("com.bfs.domain.Category");
//		System.out.println("Cache Size: " + cache.getSize()); //called two methods
//		System.out.println(cache.getKeys());
//		
		//Lock
		AuthorDao authorDao = new AuthorDao();
		
		authorDao.getOptimisticLocking();
//		
		HibernateConfigUtil.getSessionFactory().close();
	}

}
