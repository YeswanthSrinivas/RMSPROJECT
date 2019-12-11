package com.sathya.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entity.Location;
import com.sathya.admin.service.LocationService;

@RestController
@RequestMapping(path = "/locations")
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@PostMapping(path = "/addLocation")
	public Location addLocation(@RequestBody Location location) {
		return locationService.addLocation(location);
		
	}

	
	@GetMapping(path = "/getAllLocations")
	public Iterable<Location> getLocation() {
		return locationService.getAllLocations();
		
	}
	
	@PutMapping(path = "/updateLocation")
	public Location updateLocation(@RequestBody Location location) {
		return locationService.updateLocation(location);
		
	}
	
	@DeleteMapping(path = "/deleteLocation/{id}")
	public void deleteLocation(@PathVariable("id") Integer id) {
		 locationService.deleteLocation(id);
		
	}

}
