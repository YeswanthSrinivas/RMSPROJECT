package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
