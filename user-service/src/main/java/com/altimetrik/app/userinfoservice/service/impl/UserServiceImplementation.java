package com.altimetrik.app.userinfoservice.service.impl;

import org.springframework.stereotype.Service;

import com.altimetrik.app.userinfoservice.model.User;
import com.altimetrik.app.userinfoservice.repository.UserRepository;
import com.altimetrik.app.userinfoservice.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	private UserRepository userRepository;

	public UserServiceImplementation(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User retrieveUser(User user) {
		return userRepository.findByEmailIdAndPassword(user.getEmailId(),user.getPassword());
	}

	

}
