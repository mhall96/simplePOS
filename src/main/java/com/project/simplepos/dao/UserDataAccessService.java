package com.project.simplepos.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.project.simplepos.model.User;

@Repository("userDAO") //label for the specific db connections, likely will implement in mysql
public class UserDataAccessService implements UserDAO {
	
	private static List<User> db = new ArrayList<>();

	@Override
	public int insertUser(UUID id, User user) {
		db.add(new User(id,user.getName()));
		return 1;
	}

}
