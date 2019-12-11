package com.sathya.security.security.service;

import com.sathya.security.security.entity.Users;

public interface UsersService {

	Users addUsers(Users users);

	Iterable<Users> getAllUsers();

	Users updateUsers(Users users);

	void deleteUsers(Integer id);

}
