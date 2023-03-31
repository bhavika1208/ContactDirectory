package com.bhavika.cd.contactDirectory.service;

import java.util.List;
import com.bhavika.cd.contactDirectory.entity.Contact;

public interface ContactService {
	
	public List<Contact> getAllContacts(int theUserId);
	
	public Contact findById(int theContactId);
	
	public void addContact(Contact theContact);
	
	public void deleteContactById(int theContactId);

}
