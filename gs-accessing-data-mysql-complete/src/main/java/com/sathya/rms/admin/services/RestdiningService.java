package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Restdining;

public interface RestdiningService {

	Restdining addRestDining(Restdining restdining);

	Restdining updateRestDining(Restdining restdining);

	void deleteRestDining(Integer id);

	Iterable<Restdining> getAllRestDinings();

}
