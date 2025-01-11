package com.springboot.app.service;


import com.springboot.app.dao.PagingAndSortingRepositoryExample;
import com.springboot.app.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagingAndSortingExampleService {
    private final PagingAndSortingRepositoryExample repository;

    @Autowired
    public PagingAndSortingExampleService(PagingAndSortingRepositoryExample repository) {
        this.repository = repository;
    }

    public List<City> findFiveCitiesByPage(int page) {
        return repository.findAll(PageRequest.of(page, 5)).getContent();
    }
}
