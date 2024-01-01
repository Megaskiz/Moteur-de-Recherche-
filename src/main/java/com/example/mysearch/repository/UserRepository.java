package com.example.mysearch.repository;

import com.example.mysearch.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String>{
    List<User> findByEmail(String email);
    List<User> findByNom(String nom);
    
    Optional<User> findById (String id);
}
