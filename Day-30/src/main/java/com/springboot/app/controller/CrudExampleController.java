package com.springboot.app.controller;

import com.springboot.app.domain.City;
import com.springboot.app.service.CrudExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CrudExampleController {
    private final CrudExampleService service;

    @Autowired
    public CrudExampleController(CrudExampleService service) {
        this.service = service;
    }

    @GetMapping("/city/{id}")
    public City getCityById(@PathVariable int id) {
        return service.findCityById(id);
    }
}
