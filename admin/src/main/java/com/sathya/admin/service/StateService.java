package com.sathya.admin.service;

import java.util.Optional;

import com.sathya.admin.entity.State;

public interface StateService {

	Iterable<State> getAllStates();

	State insertState(State state);

	State updateState(State state);

	void deleteState(int id);
	public Optional<State> findByStId(String stId);

}
