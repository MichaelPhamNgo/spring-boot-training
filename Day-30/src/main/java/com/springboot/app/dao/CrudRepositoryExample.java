package com.springboot.app.dao;


import com.springboot.app.domain.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepositoryExample extends CrudRepository<City, Integer> {
}
