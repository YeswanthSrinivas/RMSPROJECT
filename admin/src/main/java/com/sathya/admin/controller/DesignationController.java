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

import com.sathya.admin.entity.Designation;
import com.sathya.admin.service.DesignationService;

@RestController
@RequestMapping(path = "/designation")
public class DesignationController {
	
	@Autowired
	private DesignationService designationService;
	
	@PostMapping(path = "/addDesignation")
	public Designation addDesignation(@RequestBody Designation designation) {
		return designationService.addDesignation(designation);
		
	}
	
	@PutMapping(path = "/updateDesignation")
	public Designation updateDesignation(@RequestBody Designation designation) {
		return designationService.updateDesignation(designation);
		
	}
	
	@DeleteMapping(path = "/deelteMapping/{id}")
	public void deleteDesignation(@PathVariable("id")Integer id)
	{
		designationService.deleteDesignation(id);
	}
	
	@GetMapping(path = "/getAllDesignations")
	public Iterable<Designation> getAllDesignations(){
		return designationService.getAllDesignations();
		
	}
}
