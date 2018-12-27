package com.estudo.mongo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estudo.mongo.workshopmongo.entity.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String>{

}
