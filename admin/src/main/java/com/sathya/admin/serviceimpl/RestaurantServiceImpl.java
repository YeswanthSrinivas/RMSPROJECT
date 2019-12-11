package com.sathya.admin.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.RestaurantRepository;
import com.sathya.admin.entity.Restaurant;
import com.sathya.admin.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Transactional
	public Restaurant addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRepository.save(restaurant);
	}

	@Transactional
	public Restaurant updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRepository.save(restaurant);
	}

	@Transactional
	public void deleteRestaurant(Integer id) {
		// TODO Auto-generated method stub
		
		restaurantRepository.deleteById(id);
		
	}

	@Override
	public Iterable<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		return restaurantRepository.findAll();
	}

}
