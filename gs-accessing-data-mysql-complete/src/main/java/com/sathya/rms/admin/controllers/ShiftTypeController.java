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

import com.sathya.rms.admin.entities.ShiftType;
import com.sathya.rms.admin.services.ShiftTypeService;

@RestController
@RequestMapping(path = "/shiftType")
public class ShiftTypeController {
	
	@Autowired
	private ShiftTypeService shiftTypeService;
	
	@GetMapping(path = "/getAllShifts")
	public Iterable<ShiftType> getAllCities(){
		return shiftTypeService.getAllShifts();
		
	}
	
	@PostMapping(path = "/addShift")
	public ShiftType addShift(@RequestBody ShiftType shifttype) {
		return shiftTypeService.addShift(shifttype);
		
	}
	
	@PutMapping(path = "/updateShift")
	public ShiftType updateCity(@RequestBody ShiftType shifttype) {
		return shiftTypeService.updateShift(shifttype);
		
	}
	
	@DeleteMapping(path = "/deleteShift/{id}")
	public void deleteShift(@PathVariable("id") Integer id) {
		shiftTypeService.deleteShift(id);
		
	}



}
