package com.sathya.admin.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.CityRepository;
import com.sathya.admin.entity.City;
import com.sathya.admin.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityRepository cityRepository;

	@Transactional
	public City addCity(City city) {
		// TODO Auto-generated method stub
		return cityRepository.save(city);
	}

	@Override
	public Iterable<City> getAllCities() {
		// TODO Auto-generated method stub
		return cityRepository.findAll();
	}

	@Transactional
	public City updateCity(City city) {
		// TODO Auto-generated method stub
		return cityRepository.save(city);
	}

	@Override
	@Transactional
	public void deleteCity(Integer id) {
		// TODO Auto-generated method stub
		cityRepository.deleteById(id);
		
	}

	

}
