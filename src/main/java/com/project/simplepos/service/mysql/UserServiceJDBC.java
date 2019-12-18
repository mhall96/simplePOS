package com.project.simplepos.service.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.simplepos.dao.mysql.UserDAO;
import com.project.simplepos.model.mysql.UserMySQL;

@Service
public class UserServiceJDBC {
	
	@Autowired
	UserDAO userDAO;
	
	public int addUser(Map<String, String> requestBody) {
		UserMySQL user = new UserMySQL(requestBody.get("name"));
		return userDAO.addUser(user);
	}
	
	public List<UserMySQL> returnAllUsers() {
		return userDAO.getAllUsers();
	}
}
