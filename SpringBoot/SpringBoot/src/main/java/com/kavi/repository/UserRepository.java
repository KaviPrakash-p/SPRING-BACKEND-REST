package com.kavi.repository;

import org.springframework.data.repository.CrudRepository;

import com.kavi.model.User;

public interface UserRepository extends CrudRepository<User, String>{
	User findByusername(String username);
}
