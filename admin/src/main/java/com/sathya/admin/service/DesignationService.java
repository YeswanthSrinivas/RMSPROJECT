package com.sathya.admin.service;

import com.sathya.admin.entity.Designation;

public interface DesignationService {

	Designation addDesignation(Designation designation);

	Designation updateDesignation(Designation designation);

	void deleteDesignation(Integer id);

	Iterable<Designation> getAllDesignations();

}
