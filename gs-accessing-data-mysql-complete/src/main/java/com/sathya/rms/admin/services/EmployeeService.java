package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(Integer id);

	Iterable<Employee> getAllEmployees();

	

}
