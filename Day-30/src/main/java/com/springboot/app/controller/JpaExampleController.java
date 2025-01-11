package com.springboot.app.controller;

import com.springboot.app.domain.City;
import com.springboot.app.service.JpaExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JpaExampleController {
    private final JpaExampleService service;

    @Autowired
    public JpaExampleController(JpaExampleService service) {
        this.service = service;
    }

    @GetMapping(value = "/city", params = "country")
    public List<City> findCitiesByCountryCode(@RequestParam(name = "country") String countryCode) {
        return service.findCitiesByCountryCode(countryCode);
    }

    @GetMapping("/top10/city")
    public List<City> findTop10CitiesByPopulation() {
        return service.findTop10CitiesByPopulation();
    }

    @GetMapping(value = "/city-starts-with-char", params = "leadingchar")
    public List<City> findAllCitiesThatStartWithACharacter(@RequestParam(name = "leadingchar") char c) {
        return service.findAllCitiesThatStartWithACharacter(c);
    }
}
