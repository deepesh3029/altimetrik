package com.altimetrik.app.userinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.app.userinfoservice.model.User;
import com.altimetrik.app.userinfoservice.service.UserService;
import com.altimetrik.app.userinfoservice.transport.UserConstants;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String register(User user) {
		userService.createUser(user);
		return UserConstants.SUCCESS;
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public User retrieveUser(User user) {
		User userAvail = userService.retrieveUser(user);
		return userAvail;
	}

}
