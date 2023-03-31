package com.bhavika.cd.contactDirectory.service;

import java.util.List;
import com.bhavika.cd.contactDirectory.entity.User;

public interface UserService {
		
	public List<User> findAll();
	
	public User findById(int theUserId);
	
	public void addUser(User theUser);
		
	public void deleteById(int theUserId);

}
