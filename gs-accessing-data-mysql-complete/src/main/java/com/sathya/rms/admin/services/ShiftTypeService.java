package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.ShiftType;

public interface ShiftTypeService {

	Iterable<ShiftType> getAllShifts();

	ShiftType addShift(ShiftType shifttype);

	ShiftType updateShift(ShiftType shifttype);

	void deleteShift(Integer id);


	
}
