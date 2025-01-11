package com.springboot.app.controller;


import com.springboot.app.domain.City;
import com.springboot.app.service.JpaExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CachingExampleController {
    private final JpaExampleService service;

    @Autowired
    public CachingExampleController(JpaExampleService service) {
        this.service = service;
    }

    @GetMapping("/api/caching/{id}")
    public City invokingCachedMethod(@PathVariable Integer id) {
        return service.findCityById(id);
    }
}
