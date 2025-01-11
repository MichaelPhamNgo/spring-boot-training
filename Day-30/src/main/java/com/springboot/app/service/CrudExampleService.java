package com.springboot.app.service;


import com.springboot.app.dao.CrudRepositoryExample;
import com.springboot.app.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudExampleService {
    private final CrudRepositoryExample repository;

    @Autowired
    public CrudExampleService(CrudRepositoryExample repository) {
        this.repository = repository;
    }

    public City findCityById(Integer id) {
        return repository.findById(id).orElse(new City());
    }
}
