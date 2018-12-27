package com.estudo.mongo.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.mongo.workshopmongo.entity.User;
import com.estudo.mongo.workshopmongo.repository.IUserRepository;

@Service
public class UserService {

	@Autowired
	private IUserRepository userepository;
	
	public List<User> findAll(){
		return userepository.findAll();
	}
}
