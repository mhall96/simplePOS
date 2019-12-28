package simplepos.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simplepos.model.User;
import simplepos.service.UserServiceJDBC;

@RestController
@RequestMapping("api/v2")
public class UserControllerMySQL {
	
	@Autowired
	UserServiceJDBC userService;
	
	 @GetMapping("/users")
	 public List<User> returnAllUsers(){
	     return userService.returnAllUsers();
	 }
	 
	 @PostMapping("/saveuser")
	 public int addUser(@RequestBody Map<String, String> requestBody) {
		 return userService.addUser(requestBody);
	 }
	 
}
