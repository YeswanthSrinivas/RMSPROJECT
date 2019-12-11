package com.sathya.rms.admin.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.EmpshiftRepository;
import com.sathya.rms.admin.entities.Empshift;

@Service
public class EmpshiftServiceImpl implements EmpshiftService {
	
	@Autowired
	private EmpshiftRepository empshiftRepo;

	@Transactional
	public Empshift addEmpshift(Empshift empshift) {
		// TODO Auto-generated method stub
		return empshiftRepo.save(empshift);
	}

	@Transactional
	public Empshift updateEmpshift(Empshift empshift) {
		// TODO Auto-generated method stub
		return empshiftRepo.save(empshift);
	}

	@Transactional
	public void deleteEmpshift(Integer id) {
		// TODO Auto-generated method stub
		empshiftRepo.deleteById(id);
		
	}

	@Override
	public Iterable<Empshift> getAllEmpshifts() {
		// TODO Auto-generated method stub
		return empshiftRepo.findAll();
	}

}
