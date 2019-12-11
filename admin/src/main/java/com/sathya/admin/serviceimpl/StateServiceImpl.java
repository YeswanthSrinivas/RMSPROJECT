
package com.sathya.admin.serviceimpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.StateRepository;
import com.sathya.admin.entity.State;
import com.sathya.admin.service.StateService;

@Service
public class StateServiceImpl implements StateService {
	
	@Autowired
	private StateRepository stateRepository;

	@Override
	public Iterable<State> getAllStates() {
	
		return stateRepository.findAll();
	}

	@Transactional
	public State insertState(State state) {
		// TODO Auto-generated method stub
		return stateRepository.save(state);
	}

	@Transactional
	public State updateState(State state) {
		// TODO Auto-generated method stub
		return stateRepository.save(state);
	}

	@Override
	public void deleteState(int id) {
		// TODO Auto-generated method stub
		
		stateRepository.deleteById(id);
		
	}

	@Override
	public Optional<State> findByStId(String stId) {
		// TODO Auto-generated method stub
		return stateRepository.findByStId(stId);
	}
	
	

}
