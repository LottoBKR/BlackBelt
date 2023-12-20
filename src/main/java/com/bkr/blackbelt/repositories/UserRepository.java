package com.bkr.blackbelt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bkr.blackbelt.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    
    User findByEmail(String email);
}
