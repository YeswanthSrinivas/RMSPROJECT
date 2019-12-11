package com.sathya.admin.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.DesignationRepository;
import com.sathya.admin.entity.Designation;
import com.sathya.admin.service.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {
	
	@Autowired
	private DesignationRepository designationRepository;

	@Transactional
	public Designation addDesignation(Designation designation) {
		// TODO Auto-generated method stub
		return designationRepository.save(designation);
	}

	@Transactional
	public Designation updateDesignation(Designation designation) {
		// TODO Auto-generated method stub
		return designationRepository.save(designation);
	}

	@Transactional
	public void deleteDesignation(Integer id) {
		// TODO Auto-generated method stub
		designationRepository.deleteById(id);
		
	}

	@Override
	public Iterable<Designation> getAllDesignations() {
		// TODO Auto-generated method stub
		return designationRepository.findAll();
	}

}
