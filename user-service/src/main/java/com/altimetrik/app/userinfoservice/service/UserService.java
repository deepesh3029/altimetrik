package com.altimetrik.app.userinfoservice.service;

import java.util.List;

import com.altimetrik.app.userinfoservice.model.User;

public interface UserService {

	void createUser(User user);

	User retrieveUser(User user);
}
