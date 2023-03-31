package com.bhavika.cd.contactDirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavika.cd.contactDirectory.entity.Email;
import com.bhavika.cd.contactDirectory.entity.User;
import com.bhavika.cd.contactDirectory.service.UserService;

@RestController
@RequestMapping("/cd")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService theUserService) {
		userService = theUserService;
	}
	
//	public User findById(int theUserId);
//	public void save(User theUser);
//	public void deleteById(int theUserId);
	
//	NOT TO BE USED
	@GetMapping("/users")
	public List<User>  findUsers() {
		List<User> theUser = userService.findAll();
		return theUser;
	}
	
	@GetMapping("users/{userId}")
	public User findUser(@PathVariable int userId) {
		User theUser = userService.findById(userId);
		return theUser;
	}
	
	@PostMapping("users")
	public User addUser(@RequestBody User theUser) {
		theUser.setUserId(0);
		userService.addUser(theUser);
		return theUser;
	}
	
	@PutMapping("users")
	public User updateUser(@RequestBody User theUser) {
		userService.addUser(theUser);
		return theUser;
	}
	
	@DeleteMapping("users/{userId}")
	public String deleteUser(@PathVariable int userId) {
		
		User thsUser = userService.findById(userId);
		if(thsUser==null) {
			return "No such mail exist";
		}
		userService.deleteById(userId);
		return "Mail deleted successfully";
	}
}
