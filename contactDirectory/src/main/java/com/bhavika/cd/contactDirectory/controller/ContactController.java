package com.bhavika.cd.contactDirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavika.cd.contactDirectory.entity.City;
import com.bhavika.cd.contactDirectory.entity.Contact;
import com.bhavika.cd.contactDirectory.entity.State;
import com.bhavika.cd.contactDirectory.service.AddressService;
import com.bhavika.cd.contactDirectory.service.ContactService;
import com.bhavika.cd.contactDirectory.serviceImpl.ContactServiceImpl;

@RestController
@RequestMapping("/cd")
public class ContactController {
	
	private ContactService contactService;
	
	@Autowired
	public ContactController(ContactService theContactService) {
		contactService = theContactService;
	}
	
//	public List<Contact> findAll(int theUserId);
//	public Contact findById(int theContactId);
//	public void save(Contact theContact);
//	public void deleteById(int theContactId);
	
	@GetMapping("/contacts/{userId}")
	public List<Contact> findAll(@PathVariable int userId) {
		List<Contact> theContact = contactService.getAllContacts(userId);
		return theContact;
	}
	
	
	@GetMapping("/contact/{contactId}")
	public Contact findById(@PathVariable int contactId){
		Contact theContact = contactService.findById(contactId) ;
		return theContact;
	}
	
	
	@PostMapping("/contact")
	public Contact addContact(@RequestBody Contact theContact){
		theContact.setContactId(0);
		contactService.addContact(theContact);
		return theContact;
	}
	
	@PutMapping("/contact")
	public Contact updateContact(@RequestBody Contact theContact) {
		contactService.addContact(theContact);
		return theContact;
	}
	
	@DeleteMapping("/contact/{contactId}")
	public String deleteContact(@PathVariable int contactId) {
		Contact theContact = contactService.findById(contactId);
		
		if(theContact == null) {
			throw new RuntimeException("Contact id not found ");
		}
		
		contactService.deleteContactById(contactId);
		return "Contact deleted successfully";
	}


}
