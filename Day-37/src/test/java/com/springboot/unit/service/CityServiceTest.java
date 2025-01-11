package com.springboot.unit.service;

import com.springboot.unit.dao.CityRepository;
import com.springboot.unit.domain.City;
import com.springboot.unit.exception.CustomException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class CityServiceTest {
    @Mock
    private CityRepository repository;

    @InjectMocks
    private CityService service;

//    @BeforeEach
//    public void init() {
//        MockitoAnnotations.openMocks(this);
//    }

    @Test
    void getCityById() {
        City expected = new City(1, "Kabul", "AFG", "Kabol", 1780000);
        Mockito.when(repository.findById(1))
                .thenReturn(Optional.of(new City(1, "Kabul", "AFG", "Kabol", 1780000)));
        assertEquals(expected, service.getCityById(1));
    }

    @Test
    void saveCity() {
        City city = new City(5000, "Some city", "ZZZ", "Some district", 100000000);
        Mockito.when(repository.save(city)).thenReturn(city);
        City actualCity = service.saveCity(city);
        Mockito.verify(repository, Mockito.times(1)).save(city);
        assertEquals(city, actualCity);
    }

    @Test
    void testException() {
        assertThrows(CustomException.class, () -> service.testException());
    }
}
