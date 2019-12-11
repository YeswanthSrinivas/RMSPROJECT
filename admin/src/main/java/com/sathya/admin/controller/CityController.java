package com.sathya.admin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entity.City;
import com.sathya.admin.entity.State;
import com.sathya.admin.service.CityService;
import com.sathya.admin.service.StateService;

@RestController
@RequestMapping(path = "/city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private StateService stateService;
	
	@GetMapping(path = "/getAllCities")
	public Iterable<City> getAllCities(){
		return cityService.getAllCities();
		
	}
	
	@PostMapping(path = "/addCity")
	public City addCity(@RequestBody City city) throws Exception {
		
		City result=null;
		
		Optional<State> ostate=stateService.findByStId(city.getStId());
		if(ostate.get()==null)
			throw new Exception("Invalid State id");
		city.setState(ostate.get());
		result= cityService.addCity(city);
		return result;
		
	}
	
	@PutMapping(path = "/updateCity")
	public City updateCity(@RequestBody City city) {
		return cityService.updateCity(city);
		
	}
	
	@DeleteMapping(path = "/deleteCity/{id}")
	public void deleteCity(@PathVariable("id") Integer id) {
		cityService.deleteCity(id);
		
	}


}
