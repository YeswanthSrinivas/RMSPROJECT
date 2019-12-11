package com.sathya.security.security.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.security.data.PermissionRepository;
import com.sathya.security.security.entity.Permission;
import com.sathya.security.security.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService {
	
	@Autowired
	private PermissionRepository permissionRepo;

	@Transactional
	public Permission addPermission(Permission permission) {
		// TODO Auto-generated method stub
		return permissionRepo.save(permission);
	}

	@Override
	public Iterable<Permission> getAllPermission() {
		// TODO Auto-generated method stub
		return permissionRepo.findAll();
	}

	@Transactional
	public Permission updatePermission(Permission permission) {
		// TODO Auto-generated method stub
		return permissionRepo.save(permission);
	}

	@Transactional
	public void deletePermission(Integer id) {
		// TODO Auto-generated method stub
		permissionRepo.deleteById(id);
		
	}

}
