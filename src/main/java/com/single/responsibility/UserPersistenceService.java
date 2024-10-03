package com.single.responsibility;

import java.util.HashMap;
import java.util.Map;

public class UserPersistenceService {
	Store store = new Store();
	private static final Map<String, User> STORAGE = new HashMap<>();

	public void store(User user) {
		synchronized (STORAGE) {
			STORAGE.put(user.getName(), user);
		}
	}

}
