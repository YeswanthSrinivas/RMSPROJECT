package com.sathya.rms.admin.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.RestdiningRepository;
import com.sathya.rms.admin.entities.Restdining;

@Service
public class RestdiningServiceImpl implements RestdiningService {
	
	@Autowired
	private RestdiningRepository restdiningRepo;

	@Transactional
	public Restdining addRestDining(Restdining restdining) {
		// TODO Auto-generated method stub
		return restdiningRepo.save(restdining);
	}

	@Transactional
	public Restdining updateRestDining(Restdining restdining) {
		// TODO Auto-generated method stub
		return restdiningRepo.save(restdining);
	}

	@Transactional
	public void deleteRestDining(Integer id) {
		// TODO Auto-generated method stub
		restdiningRepo.deleteById(id);
		
	}

	@Override
	public Iterable<Restdining> getAllRestDinings() {
		// TODO Auto-generated method stub
		return restdiningRepo.findAll();
	}

}
