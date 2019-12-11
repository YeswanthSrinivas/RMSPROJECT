package com.sathya.admin.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.LocationRepository;
import com.sathya.admin.entity.Location;
import com.sathya.admin.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository;

	@Transactional
	public Location addLocation(Location location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	@Override
	public Iterable<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

	@Transactional
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Integer id) {
		// TODO Auto-generated method stub
		locationRepository.deleteById(id);
		
	}

	

}
