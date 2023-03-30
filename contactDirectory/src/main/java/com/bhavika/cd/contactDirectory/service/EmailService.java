package com.bhavika.cd.contactDirectory.service;

import java.util.List;

import com.bhavika.cd.contactDirectory.entity.Address;
import com.bhavika.cd.contactDirectory.entity.Email;

public interface EmailService {
	
	public List<Email> findAll(int theContactId);
	
	public Email findById(int theEmailId);
	
	public void save(Email theEmail);
	
	public void deleteById(int theEmailId);

}
