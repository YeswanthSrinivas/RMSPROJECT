package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Empshift;

public interface EmpshiftService {

	Empshift addEmpshift(Empshift empshift);

	Empshift updateEmpshift(Empshift empshift);

	void deleteEmpshift(Integer id);

	Iterable<Empshift> getAllEmpshifts();

}
