package com.sathya.security.security.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.security.data.RoleRepository;
import com.sathya.security.security.entity.Role;
import com.sathya.security.security.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepo;

	@Transactional
	public Role addRole(Role roles) {
		// TODO Auto-generated method stub
		return roleRepo.save(roles);
	}

	@Override
	public Iterable<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return roleRepo.findAll();
	}

	@Transactional
	public Role updateRoles(Role roles) {
		// TODO Auto-generated method stub
		return roleRepo.save(roles);
	}

	@Transactional
	public void deleteRoles(Integer id) {
		// TODO Auto-generated method stub
		roleRepo.deleteById(id);
		
	}

}
