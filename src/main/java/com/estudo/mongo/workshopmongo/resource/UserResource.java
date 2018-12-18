package com.estudo.mongo.workshopmongo.resource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.mongo.workshopmongo.entity.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Silva", "maria@teste.com");
		User ze = new User("2", "Ze Silva", "ze@teste.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, ze));
		return ResponseEntity.ok().body(list);  
		}
}
