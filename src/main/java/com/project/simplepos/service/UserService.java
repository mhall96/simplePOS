/*package com.project.simplepos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.simplepos.dao.UserDAO;
import com.project.simplepos.model.User;

@Service
public class UserService {

	private final UserDAO userDAO;
	
	@Autowired
	public UserService(@Qualifier("userDAO") UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public int addUser(User user) {
		return userDAO.insertUser(user);
	}
	
	public List<User> getAllUsers(){
		return userDAO.selectAllUsers();
	}
}
*/