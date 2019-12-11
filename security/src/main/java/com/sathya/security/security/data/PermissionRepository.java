package com.sathya.security.security.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.security.entity.Permission;

public interface PermissionRepository extends CrudRepository<Permission, Integer> {

}
