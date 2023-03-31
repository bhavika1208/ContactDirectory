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

import com.bhavika.cd.contactDirectory.entity.Email;
import com.bhavika.cd.contactDirectory.service.EmailService;

@RestController
@RequestMapping("/cd")
public class EmailController {
	
	private EmailService emailService;
	
	@Autowired
	public EmailController(EmailService thEmailService) {
		emailService = thEmailService;
	}
	
//	public List<Email> findAll(int theContactId);
//	public Email findById(int theEmailId);
//	public void save(Email theEmail);
//	public void deleteById(int theEmailId);
	
	@GetMapping("/allemails")
	public List<Email> findAllEmails(){
		List<Email> theEmails = emailService.findAllEmails();
		return theEmails;
	}
	
	
	@GetMapping("/emails/{contactId}")
	public List<Email> findEmailByContactId(@PathVariable int contactId){
		List<Email> thEmails = emailService.findEmailByContactId(contactId);
		return thEmails;
	}
	
	
	@GetMapping("/email/{emailId}")
	public Email findById(@PathVariable int emailId) {
		 Email thEmail = emailService.findById(emailId);
		 return thEmail;
	}
	
	@PostMapping("/email")
	public Email addEmail(@RequestBody Email theEmail){
		theEmail.setContactId(0);
		emailService.save(theEmail);
		return theEmail;
	}
	
	@PutMapping("/email")
	public Email updatEmail(@RequestBody Email theEmail){
		emailService.save(theEmail);
		return theEmail;
	}
	
	@DeleteMapping("/email/{emailId}")
	public String deleteEmail(@PathVariable int emailId) {
		
		Email thEmail = emailService.findById(emailId);
		if(thEmail==null) {
			return "No such mail exist";
		}
		emailService.deleteById(emailId);
		return "Mail deleted successfully";
	}
	
}
