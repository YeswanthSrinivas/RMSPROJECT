package com.sathya.security.security.service;

import com.sathya.security.security.entity.Permission;

public interface PermissionService {

	Permission addPermission(Permission permission);

	Iterable<Permission> getAllPermission();

	Permission updatePermission(Permission permission);

	void deletePermission(Integer id);

}
