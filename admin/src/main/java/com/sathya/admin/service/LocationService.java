package com.sathya.admin.service;

import com.sathya.admin.entity.Location;

public interface LocationService {

	

	Location addLocation(Location location);

	Iterable<Location> getAllLocations();

	Location updateLocation(Location location);

	void deleteLocation(Integer id);

	

}
