package com.weprovide.webshop.api.services;

import com.weprovide.webshop.api.models.User;
import com.weprovide.webshop.api.repositories.UserRepository;
import com.weprovide.webshop.api.util.requests.LoginRequest;
import com.weprovide.webshop.api.util.requests.NewUserRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

	public User loginUser(LoginRequest request) {
        User user = this.repository.findByUsername(request.username);
		return user.getPassword().equals(request.password) ? user : null;
	}

	public User createAccount(NewUserRequest request) {

        if(!this.repository.existsByUsername(request.username)){
            User user =  new User();
            user.setName(request.name);
            user.setUsername(request.username);
            user.setPassword(request.password);
            
            this.repository.save(user);

            return user;
        }
		return null;
	}
}