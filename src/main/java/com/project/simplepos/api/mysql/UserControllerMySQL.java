package com.project.simplepos.api.mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.simplepos.dao.mysql.UserMySQLRepository;
import com.project.simplepos.model.mysql.UserMySQL;

@RestController
@RequestMapping("api/v2")
public class UserControllerMySQL {
	
	 @Autowired
	 UserMySQLRepository userRepository;

	 @GetMapping("/users")
	 public List<UserMySQL> returnAllUsers(){
	     return userRepository.findAll();
	 }
}
