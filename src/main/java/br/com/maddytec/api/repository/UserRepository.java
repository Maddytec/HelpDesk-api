package br.com.maddytec.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.maddytec.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
	
	
}
