package com.sathya.security.security.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.security.data.UsersRepository;
import com.sathya.security.security.entity.Users;
import com.sathya.security.security.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository usersRepo;

	@Transactional
	public Users addUsers(Users users) {
		// TODO Auto-generated method stub
		return usersRepo.save(users);
	}

	@Override
	public Iterable<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return usersRepo.findAll();
	}

	@Transactional
	public Users updateUsers(Users users) {
		// TODO Auto-generated method stub
		return usersRepo.save(users);
	}

	@Transactional
	public void deleteUsers(Integer id) {
		// TODO Auto-generated method stub
		usersRepo.deleteById(id);
		
	}

}
