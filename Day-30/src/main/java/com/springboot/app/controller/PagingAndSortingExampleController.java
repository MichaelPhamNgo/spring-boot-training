package com.springboot.app.controller;

import com.springboot.app.domain.City;
import com.springboot.app.service.PagingAndSortingExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PagingAndSortingExampleController {
    private final PagingAndSortingExampleService service;

    @Autowired
    public PagingAndSortingExampleController(PagingAndSortingExampleService service) {
        this.service = service;
    }

    @GetMapping("/city/page/{page}")
    public List<City> findFiveCitiesByPage(@PathVariable int page) {
        return service.findFiveCitiesByPage(page);
    }
}
