package com.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring.model.User;
import com.springsecurity.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
