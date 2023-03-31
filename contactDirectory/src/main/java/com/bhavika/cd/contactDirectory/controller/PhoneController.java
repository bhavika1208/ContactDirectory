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

import com.bhavika.cd.contactDirectory.entity.Phone;
import com.bhavika.cd.contactDirectory.service.PhoneService;

@RestController
@RequestMapping("/cd")
public class PhoneController {
	
	private PhoneService phoneService;
	
	@Autowired
	public PhoneController(PhoneService thePhoneService) {
		phoneService = thePhoneService;
	}
	
	@GetMapping("/phone/{contactId}")
	public List<Phone> findAll(@PathVariable int contactId){
		List<Phone> thePhone = phoneService.findAll(contactId);
		return thePhone;
	}
	
	
	@GetMapping("/phone/{phoneId}")
	public Phone findById(@PathVariable int phoneId) {
		Phone thePhone = phoneService.findById(phoneId);
		 return thePhone;
	}
	
	@PostMapping("/phone")
	public Phone addPhone(@RequestBody Phone thePhone){
		thePhone.setContactId(0);
		phoneService.save(thePhone);
		return thePhone;
	}
	
	@PutMapping("/phone")
	public Phone updatPhone(@RequestBody Phone thePhone){
		phoneService.save(thePhone);
		return thePhone;
	}
	
	@DeleteMapping("/phone/{phoneId}")
	public String deletePhone(@PathVariable int phoneId) {
		
		Phone thePhone = phoneService.findById(phoneId);
		if(thePhone==null) {
			return "No such mail exist";
		}
		phoneService.deleteById(phoneId);
		return "Mail deleted successfully";
	}
	
}
