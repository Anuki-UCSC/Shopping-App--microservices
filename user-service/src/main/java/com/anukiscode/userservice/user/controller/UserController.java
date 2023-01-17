package com.anukiscode.userservice.user.controller;


import com.anukiscode.userservice.user.Dto.LoginDto;
import com.anukiscode.userservice.user.entity.User;
import com.anukiscode.userservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDto loginDto){
        List<String> response = userService.Login(loginDto.getUsername(), loginDto.getPassword());

        if(response.isEmpty()){
           return ResponseEntity.ok("Login Success");
        }
        return ResponseEntity.unprocessableEntity().body(response);
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user){
        List<String> response = userService.Register(user);

        if(response.isEmpty()){
            return ResponseEntity.ok("Registration Success");
        }
        return ResponseEntity.unprocessableEntity().body(response);
    }
}
