package com.sathya.security.security.service;

import com.sathya.security.security.entity.Role;

public interface RoleService {

	Role addRole(Role roles);

	Iterable<Role> getAllRoles();

	Role updateRoles(Role roles);

	void deleteRoles(Integer id);

}
