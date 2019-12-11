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

import com.sathya.admin.entity.Restaurant;
import com.sathya.admin.service.RestaurantService;

@RestController
@RequestMapping(path = "/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@PostMapping(path = "/addRestaurant")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.addRestaurant(restaurant);
		
	}
	
	@PutMapping(path = "/updateRestaurant")
	public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.updateRestaurant(restaurant);
		
	}
	
	@DeleteMapping(path = "/deleteRestaurant/{id}")
	public void deleteRestaurant(@PathVariable("id")Integer id) {
		 restaurantService.deleteRestaurant(id);
		
	}
	
	@GetMapping(path = "/getAllRestaurants")
	public Iterable<Restaurant> getAllRestaurant() {
		return restaurantService.getAllRestaurants();
	}

}
