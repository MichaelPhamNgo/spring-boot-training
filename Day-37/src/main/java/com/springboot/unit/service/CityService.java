package com.springboot.unit.service;

import com.springboot.unit.dao.CityRepository;
import com.springboot.unit.domain.City;
import com.springboot.unit.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    private final CityRepository repository;

    @Autowired
    public CityService(CityRepository repository) {
        this.repository = repository;
    }

    public City getCityById(int id) {
        return repository.findById(id).orElse(new City());
    }

    public City saveCity(City city) {
        return repository.save(city);
    }

    public void testException() throws CustomException {
        throw new CustomException("throwing custom message");
    }
}
