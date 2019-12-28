package simplepos.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplepos.dao.UserDAO;
import simplepos.model.User;

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
