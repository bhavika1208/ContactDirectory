package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bhavika.cd.contactDirectory.entity.User;
import com.bhavika.cd.contactDirectory.repository.UserRepository;
import com.bhavika.cd.contactDirectory.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository theuserRepository) {
		userRepository = theuserRepository;
	}
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User findById(int theUserId) {
		Optional<User> result = userRepository.findById(theUserId);
		
		User theUser = null;
		
		if (result.isPresent()) {
			theUser = result.get();
		}
		else {
			throw new RuntimeException("Did not find User id - " + theUserId);
		}
		return theUser;
	}

	@Override
	public void addUser(User theUser) {
		userRepository.save(theUser);
	}	

	@Override
	public void deleteById(int theUserId) {
		userRepository.deleteById(theUserId);
	}
	
}