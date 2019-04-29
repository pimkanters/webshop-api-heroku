package com.weprovide.webshop.api.controllers;

import com.weprovide.webshop.api.models.User;
import com.weprovide.webshop.api.services.UserService;
import com.weprovide.webshop.api.util.requests.LoginRequest;
import com.weprovide.webshop.api.util.requests.NewUserRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> loginUser(@RequestBody LoginRequest request){

        User user = this.service.loginUser(request);

        if (!user.equals(null)){
            return ResponseEntity.status(201).body(user);
        } else {
            return ResponseEntity.status(401).body(null);
        }
    }

    @PostMapping(value="/new")
    public ResponseEntity<User> createAccount(@RequestBody NewUserRequest request) {
        
        User user = this.service.createAccount(request);

        if (!user.equals(null)){
            return ResponseEntity.status(201).body(user);
        } else {
            return ResponseEntity.status(401).body(null);
        }
    }
}