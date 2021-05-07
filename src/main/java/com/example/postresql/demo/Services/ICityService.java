package com.example.postresql.demo.Services;

import com.example.postresql.demo.Entities.City;

import java.util.List;

public interface ICityService {
    List<City> findAllCities();
    City findCityById(long id);
    City saveCity(City city);
    City deleteCity(City city);
}
