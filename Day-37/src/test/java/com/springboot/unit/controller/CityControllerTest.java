package com.springboot.unit.controller;

import com.springboot.unit.domain.City;
import com.springboot.unit.service.CityService;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(controllers = CityController.class)
class CityControllerTest {
    @MockBean
    private CityService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getCityById() throws Exception {
        City expected = new City(1, "Kabul", "AFG", "Kabol", 1780000);
        Mockito.when(service.getCityById(1)).thenReturn(expected);
        mockMvc.perform(MockMvcRequestBuilders.get("/city/1"))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.content().json("{'id': 1,'name': 'Kabul', 'countryCode': 'AFG', 'district': 'Kabol', 'population': 1780000}"));
    }

    @Test
    void saveCity() throws Exception {
        City city = new City(5000, "Some city", "ZZZ", "Some district", 100000000);
        Mockito.when(service.saveCity(city)).thenReturn(city);
        Gson gson = new Gson();
        String json = gson.toJson(city);
        System.out.println(json);
        mockMvc.perform(MockMvcRequestBuilders.post("/city")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.content().json("{'id': 5000,'name': 'Some city', 'countryCode': 'ZZZ', 'district': 'Some district', 'population': 100000000}"));
    }
}
