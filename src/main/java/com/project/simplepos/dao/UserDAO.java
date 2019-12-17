/*package com.project.simplepos.dao;

import java.util.List;
import java.util.UUID;

import com.project.simplepos.model.User;

public interface UserDAO {
	
	int insertUser(UUID id, User user);
	
	default int insertUser(User user) {
		UUID id = UUID.randomUUID();
		return insertUser(id, user);
	}
	
	List<User> selectAllUsers();
}
*/