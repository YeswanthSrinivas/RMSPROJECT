package com.sathya.security.security.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.security.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
