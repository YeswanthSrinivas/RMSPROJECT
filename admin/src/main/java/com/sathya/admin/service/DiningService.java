package com.sathya.admin.service;

import com.sathya.admin.entity.Dining;

public interface DiningService {

	Dining addDining(Dining dining);

	Iterable<Dining> getAllDinings();

	Dining updateDining(Dining dining);

	void deleteDining(Integer id);

}
