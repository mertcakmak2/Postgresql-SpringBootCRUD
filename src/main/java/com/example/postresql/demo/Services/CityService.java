package com.example.postresql.demo.Services;

import com.example.postresql.demo.Entities.City;
import com.example.postresql.demo.Repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService implements ICityService{

    private final CityRepository repository;

    @Override
    public List<City> findAllCities() {
        return repository.findAll();
    }

    @Override
    public City findCityById(long id) {
        return repository.findById(id).orElseGet(null);
    }

    @Override
    public City saveCity(City city) {
        return repository.save(city);
    }

    @Override
    public City deleteCity(City city) {
        repository.delete(city);
        return city;
    }
}
