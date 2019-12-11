package com.sathya.admin.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.DiningRepository;
import com.sathya.admin.entity.Dining;
import com.sathya.admin.service.DiningService;

@Service
public class DiningServiceImpl implements DiningService {
	
	@Autowired
	private DiningRepository diningRepository;

	@Transactional
	public Dining addDining(Dining dining) {
		// TODO Auto-generated method stub
		return diningRepository.save(dining);
	}

	@Override
	public Iterable<Dining> getAllDinings() {
		// TODO Auto-generated method stub
		return diningRepository.findAll();
	}

	@Transactional
	public Dining updateDining(Dining dining) {
		// TODO Auto-generated method stub
		return diningRepository.save(dining);
	}

	@Transactional
	public void deleteDining(Integer id) {
		// TODO Auto-generated method stub
		diningRepository.deleteById(id);
		
	}

}
