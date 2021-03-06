package com.project.simplepos.service.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.simplepos.dao.mysql.UserDAO;
import com.project.simplepos.model.mysql.User;

@Service
public class UserServiceJDBC {
	
	@Autowired
	UserDAO userDAO;
	
	public int addUser(Map<String, String> requestBody) {
		User user = new User(requestBody.get("name"));
		return userDAO.addUser(user);
	}
	
	public List<User> returnAllUsers() {
		return userDAO.getAllUsers();
	}
}
