package com.sathya.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.admin.entity.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
