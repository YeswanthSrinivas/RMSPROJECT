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

import com.sathya.security.security.entity.Role;
import com.sathya.security.security.entity.Users;
import com.sathya.security.security.service.RoleService;

@RestController
@RequestMapping(path = "/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping(path = "/addRole")
	public Role addRole(@RequestBody Role roles) {
		return roleService.addRole(roles);
		
	}
	
	@GetMapping(path = "/getAllRoles")
	private Iterable<Role> getAllRoles(){
		return roleService.getAllRoles();
		
	}
	
	
	@PutMapping(path = "/updateRoles")
	private Role updateRoles(@RequestBody Role roles) {
		return roleService.updateRoles(roles);
		
	}
	
	@DeleteMapping(path = "/deleteRoles/{id}")
	private void deleteRoles(@PathVariable("id")Integer id) {
		
		roleService.deleteRoles(id);
		
	}
	

}
