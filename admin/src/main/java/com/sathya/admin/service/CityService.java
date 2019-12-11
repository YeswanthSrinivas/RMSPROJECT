package com.sathya.admin.service;

import com.sathya.admin.entity.City;

public interface CityService {

	City addCity(City city);

	Iterable<City> getAllCities();

	City updateCity(City city);

	

	void deleteCity(Integer id);

}
