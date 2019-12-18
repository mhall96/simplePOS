package com.project.simplepos.service.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.simplepos.dao.mysql.UserMySQLRepository;
import com.project.simplepos.model.mysql.UserMySQL;

@Service
public class UserServiceMySQL {

	 @Autowired
	 UserMySQLRepository userRepository;

	 public List<UserMySQL> returnAllUsers(){
	     return userRepository.findAll();
	 }
	 
	 public UserMySQL addUser(Map<String, String> requestBody){
		 UserMySQL user = new UserMySQL(requestBody.get("name"));
		 return userRepository.save(user);
	 }
}
