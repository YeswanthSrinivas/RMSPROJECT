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

import com.sathya.rms.admin.entities.Employee;
import com.sathya.rms.admin.services.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path = "/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		
	}
	
	@PutMapping(path = "/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
		
	}
	
	@DeleteMapping(path = "/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id")Integer id) {
		 employeeService.deleteEmployee(id);
		
	}
	
	@GetMapping(path = "/getAllEmployees")
	public Iterable<Employee> getAllEmployess(){
		return employeeService.getAllEmployees();
		
	}

}
