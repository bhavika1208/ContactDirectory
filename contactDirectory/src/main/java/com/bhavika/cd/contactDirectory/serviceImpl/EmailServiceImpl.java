package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavika.cd.contactDirectory.entity.City;
import com.bhavika.cd.contactDirectory.entity.Email;
import com.bhavika.cd.contactDirectory.entity.Phone;
import com.bhavika.cd.contactDirectory.repository.EmailRepository;
import com.bhavika.cd.contactDirectory.repository.StateRepository;
import com.bhavika.cd.contactDirectory.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

private EmailRepository emailRepository;	
	
	@Autowired
	public EmailServiceImpl(EmailRepository theEmailRepository){
		emailRepository = theEmailRepository;
	}
	
	// ************************************************************ TO BE DONE // check
	@Override
	public List<Email> findEmailByContactId(int contactId) {
		SessionFactory factory = new Configuration().configure("src/main/resources/hibernate.cfg.xml").addAnnotatedClass(City.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Email> theEmails = session.createQuery("from Email WHERE contactId='" + contactId + "'").getResultList();
		return theEmails;
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

	@Override
	public List<Email> findAllEmails() {
		return emailRepository.findAll();
	}

}
