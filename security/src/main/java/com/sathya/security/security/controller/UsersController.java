package com.sathya.security.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.security.entity.Users;
import com.sathya.security.security.service.UsersService;

@RestController
@RequestMapping(path = "/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@PostMapping(path = "/addUsers")
	public Users addUsers(@RequestBody Users users) {
		return usersService.addUsers(users);
		
	}
	
	@GetMapping(path = "/getAllUsers")
	private Iterable<Users> getAllUsers(){
		return usersService.getAllUsers();
		
	}
	
	@PutMapping(path = "/updateUsers")
	private Users updateUsers(@RequestBody Users users) {
		return usersService.updateUsers(users);
		
	}
	
	@DeleteMapping(path = "/deleteUsers/{id}")
	private void deleteUsers(@PathVariable("id")Integer id) {
		
		usersService.deleteUsers(id);
		
	}

}
