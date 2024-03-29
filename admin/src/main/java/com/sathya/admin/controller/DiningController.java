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

import com.sathya.admin.entity.Dining;
import com.sathya.admin.service.DiningService;

@RestController
@RequestMapping(path = "/dining")
public class DiningController {
	
	@Autowired
	private DiningService diningService;
	
	@PostMapping(path = "/addDining")
	public Dining  addDining(@RequestBody Dining dining) {
		return diningService.addDining(dining);
		
	}
	
	@GetMapping(path = "/getAllDinings")
	public Iterable<Dining> getAllDinings(){
		return diningService.getAllDinings();
		
	}
	
	@PutMapping(path = "/updateDining")
	public Dining updateDining(@RequestBody Dining dining) {
		return diningService.updateDining(dining);
		
	}
	
	@DeleteMapping(path = "/deleteDining/{id}")
	public void deleteDining(@PathVariable("id") Integer id) {
		
		diningService.deleteDining(id);
		
	}

}
