package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Restdining;
import com.sathya.rms.admin.services.RestdiningService;

@RestController
@RequestMapping(path = "/restdining")
public class RestdiningController {
	
	@Autowired
	private RestdiningService restdiningService;
	
	@PostMapping(path = "/addRestDining")
	private Restdining addRestDining(@RequestBody Restdining restdining) {
		return restdiningService.addRestDining(restdining);
		
	}
	
	@PutMapping(path = "/updateRestDining")
	private Restdining updateRestDining(@RequestBody Restdining restdining) {
		return restdiningService.updateRestDining(restdining);
		
	}
	
	@DeleteMapping(path = "/deleteDining/{id}")
	private void deleteRestDining(@PathVariable("id")Integer id) {
		 restdiningService.deleteRestDining(id);
		
	}
	
	@GetMapping(path = "/getAllDinings")
	public Iterable<Restdining> getAllRestDinings(){
		return restdiningService.getAllRestDinings();
		
	}



}
