package com.sathya.rms.admin.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.ShiftTypeRepository;
import com.sathya.rms.admin.entities.ShiftType;

@Service
public class ShiftTypeServiceImpl implements ShiftTypeService {
	
	@Autowired
	private ShiftTypeRepository shiftTypeRepo;

	@Override
	public Iterable<ShiftType> getAllShifts() {
		// TODO Auto-generated method stub
		return shiftTypeRepo.findAll();
	}

	@Transactional
	public ShiftType addShift(ShiftType shifttype) {
		// TODO Auto-generated method stub
		return shiftTypeRepo.save(shifttype);
	}

	@Transactional
	public ShiftType updateShift(ShiftType shifttype) {
		// TODO Auto-generated method stub
		return shiftTypeRepo.save(shifttype);
	}

	@Transactional
	public void deleteShift(Integer id) {
		// TODO Auto-generated method stub
		shiftTypeRepo.deleteById(id);
	}

	
	
}
