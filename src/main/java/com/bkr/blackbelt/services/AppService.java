package com.bkr.blackbelt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bkr.blackbelt.models.User;
import com.bkr.blackbelt.repositories.UserRepository;

@Service
public class AppService {
    
    @Autowired
    private UserRepository userRepo;

    public User saveUser(User u){
        return userRepo.save(u);
    }

    public User findUserById(Long id){
        return userRepo.findById(id).orElse(null);
    }

    // public User findUserByEmail(String email){
    //     return userRepo.findByEmail(email);
    // }
}
