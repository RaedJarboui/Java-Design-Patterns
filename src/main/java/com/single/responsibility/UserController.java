package com.single.responsibility;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {

	// Create a new user
	public String createUser(String userJson) throws IOException {
		// responsibility 1 : parse
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(userJson, User.class);

		// responsibility 2 : validators for user -> treated into different class called
		// UserValidation
		UserValidation userValidation = new UserValidation();
		if (!userValidation.isValidUser(user)) {
			return "ERROR";
		}

		// responsibility 2 : storage user => handled into different class
		// UserPersistenceService

		UserPersistenceService userPersistenceService = new UserPersistenceService();

		userPersistenceService.store(user);

		return "SUCCESS";
	}

}
