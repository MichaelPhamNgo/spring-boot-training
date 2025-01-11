package com.springboot.app.dao;


import com.springboot.app.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaRepositoryExample extends JpaRepository<City, Integer> {

    List<City> findByCountryCodeIgnoreCase(String countryCode);

    List<City> findTop10ByOrderByPopulationDesc();

    @Query("FROM City c WHERE c.name LIKE LOWER(CONCAT(:c, '%'))")
    List<City> findAllCitiesThatStartWithACharacter(char c);
}
