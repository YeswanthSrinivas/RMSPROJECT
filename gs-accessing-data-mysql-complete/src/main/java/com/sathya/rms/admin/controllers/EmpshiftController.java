package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Empshift;
import com.sathya.rms.admin.services.EmpshiftService;

@RestController
@RequestMapping(path = "/empshift")
public class EmpshiftController {
	
	@Autowired
	private EmpshiftService empshiftService;
	
	@PostMapping(path = "/addEmpshift")
	private Empshift addEmpshift(Empshift empshift) {
		return empshiftService.addEmpshift(empshift);
		
	}
	
	@PutMapping(path = "/updateEmpshift")
	private Empshift updateEmpshift(Empshift empshift) {
		return empshiftService.updateEmpshift(empshift);
		
	}
	
	@DeleteMapping(path = "/deleteEmpshift/{id}")
	private void deleteEmpshift(@PathVariable("id")Integer id) {
		 empshiftService.deleteEmpshift(id);
		
	}
	
	@GetMapping(path = "/getAllEmpshifts")
	public Iterable<Empshift> getAllEmpshifts(){
		return empshiftService.getAllEmpshifts();
		
	}

}
