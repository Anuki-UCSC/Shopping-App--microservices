package com.anukiscode.userservice.user.service;


import com.anukiscode.userservice.user.entity.User;
import com.anukiscode.userservice.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<String> Login(String username, String password){
        List<String> errors = new ArrayList<>();

        if(StringUtils.isEmpty(username)){
            errors.add("Please enter Login Id.");
        }
        if(StringUtils.isEmpty(password)){
            errors.add("Please enter Password.");
        }
        Optional<User> account = userRepo.findByUsername(username);

        if(!account.isPresent()) {
            errors.add("Please check your username.");
        }else{
            System.out.println(account.get().getPassword());
            if(!password.equals(account.get().getPassword())){
                errors.add("Please check your password.");
            }
        }
        return errors;
    }

    public List<String> Register(User user){
        List<String> errors = new ArrayList<>();

        Optional<User> account = userRepo.findByUsername(user.getUsername());

        if(account.isPresent()){
            errors.add("Username Already Exists.");
        }
        if(user.getUsername().isEmpty()){
            errors.add("Username is missing.");
        }
        if(user.getPassword().isEmpty()){
            errors.add("Password is missing.");
        }
        if(errors.isEmpty()){
            user.setRole(User.Role.Customer);
            userRepo.save(user);
        }
        return errors;
    }


}
