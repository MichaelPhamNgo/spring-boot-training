package com.springboot.unit.controller;

import com.springboot.unit.domain.City;
import com.springboot.unit.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    private final CityService service;

    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping("/city/{id}")
    public City getCityById(@PathVariable int id) {
        return service.getCityById(id);
    }

    @PostMapping("/city")
    public City saveCity(@RequestBody City city) {
        return service.saveCity(city);
    }
}
