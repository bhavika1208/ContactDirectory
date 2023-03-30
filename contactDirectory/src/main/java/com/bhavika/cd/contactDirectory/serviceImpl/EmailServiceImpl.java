package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bhavika.cd.contactDirectory.entity.Email;
import com.bhavika.cd.contactDirectory.entity.Phone;
import com.bhavika.cd.contactDirectory.repository.EmailRepository;
import com.bhavika.cd.contactDirectory.repository.StateRepository;
import com.bhavika.cd.contactDirectory.service.EmailService;

public class EmailServiceImpl implements EmailService {

private EmailRepository emailRepository;	
	
	@Autowired
	public EmailServiceImpl(EmailRepository theEmailRepository){
		emailRepository = theEmailRepository;
	}
	// ************************************************************ TO BE DONE
	@Override
	public List<Email> findAll(int theContactId) {
		return null;
	}

	@Override
	public Email findById(int theEmailId) {
		
		Optional<Email> result = emailRepository.findById(theEmailId);	
		Email theEmail = null;
	
		if (result.isPresent()) {
			theEmail = result.get();
		}
		else {
			throw new RuntimeException("Did not find the email with id - " + theEmailId);
		}
	
			return theEmail;
	}
	
	@Override
	public void save(Email theEmail) {
		emailRepository.save(theEmail);
	}

	@Override
	public void deleteById(int theEmailId) {
		emailRepository.deleteById(theEmailId);
	}

}
