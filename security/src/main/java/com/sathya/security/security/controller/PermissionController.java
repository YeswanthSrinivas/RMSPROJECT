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

import com.sathya.security.security.entity.Permission;
import com.sathya.security.security.entity.Role;
import com.sathya.security.security.service.PermissionService;

@RestController
@RequestMapping(path = "/permission")
public class PermissionController {
	
	@Autowired
	private PermissionService permissionService;
	
	
	@PostMapping(path = "/addPermission")
	public Permission addPermission(@RequestBody Permission permission) {
		return permissionService.addPermission(permission);
		
	}
	
	@GetMapping(path = "/getAllPermissions")
	private Iterable<Permission> getAllPermissions(){
		return permissionService.getAllPermission();
		
	}
	
	
	@PutMapping(path = "/updatePermission")
	private Permission updatePermission(@RequestBody Permission permission) {
		return permissionService.updatePermission(permission);
		
	}
	
	@DeleteMapping(path = "/deletePermission/{id}")
	private void deletePermission(@PathVariable("id")Integer id) {
		
		permissionService.deletePermission(id);
		
	}
	

}
