package com.bkr.blackbelt.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bkr.blackbelt.models.User;
import com.bkr.blackbelt.repositories.UserRepository;
import org.springframework.validation.BindingResult;

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

    public User register(User newUser, BindingResult result) {

        String email = newUser.getEmail();
        User isUser = userRepo.findByEmail(email); //NULL o Objeto Usuario
        if(isUser != null) {
            result.rejectValue("email", "Unique", "The email is already in use");
        }

        String password = newUser.getPassword();
        String confirm = newUser.getPasswordConfirm();
        if(!password.equals(confirm)) { //! -> Lo contrario
            result.rejectValue("passwordConfirm", "Matches", "The passwords don't match");
        }

        if(result.hasErrors()) {
            return null;
        } else {
            String pass_encript = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(pass_encript);
            return userRepo.save(newUser);
        }

    }
    public User login(String email, String password) {

        User userExists = userRepo.findByEmail(email); //NULL o Objeto de User
        if(userExists == null) {
            return null;
        }

        if(BCrypt.checkpw(password, userExists.getPassword())) {
            return userExists;
        } else {
            return null;
        }

    }
}
