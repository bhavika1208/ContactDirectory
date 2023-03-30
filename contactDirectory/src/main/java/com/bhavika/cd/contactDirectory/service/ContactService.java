package com.bhavika.cd.contactDirectory.service;

import java.util.List;
import com.bhavika.cd.contactDirectory.entity.Contact;

public interface ContactService {
	
	public List<Contact> findAll(int theUserId);
	
	public Contact findById(int theContactId);
	
	public void save(Contact theContact);
	
	public void deleteById(int theContactId);

}
