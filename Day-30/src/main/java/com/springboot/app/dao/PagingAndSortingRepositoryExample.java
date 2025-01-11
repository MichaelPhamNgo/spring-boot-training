package com.springboot.app.dao;


import com.springboot.app.domain.City;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagingAndSortingRepositoryExample extends PagingAndSortingRepository<City, Integer> {
}
