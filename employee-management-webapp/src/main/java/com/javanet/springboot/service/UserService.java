package com.javanet.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.javanet.springboot.dto.UserRegistrationDto;
import com.javanet.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
