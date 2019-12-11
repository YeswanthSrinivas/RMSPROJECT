package com.sathya.admin.service;

import com.sathya.admin.entity.Restaurant;

public interface RestaurantService {

	Restaurant addRestaurant(Restaurant restaurant);

	Restaurant updateRestaurant(Restaurant restaurant);

	void deleteRestaurant(Integer id);

	Iterable<Restaurant> getAllRestaurants();

}
