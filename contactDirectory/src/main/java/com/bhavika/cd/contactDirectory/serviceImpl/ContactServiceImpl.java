package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.bhavika.cd.contactDirectory.entity.City;
import com.bhavika.cd.contactDirectory.entity.Contact;
import com.bhavika.cd.contactDirectory.entity.Email;
import com.bhavika.cd.contactDirectory.repository.ContactRepository;
import com.bhavika.cd.contactDirectory.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	private ContactRepository contactRepository;
	
	public ContactServiceImpl(ContactRepository theContactRepository) {
		contactRepository = theContactRepository;
	}
	
	// ************************************************************************ TO BE DONE
	@Override
	public List<Contact> getAllContacts(int userId) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Contact.class)
									.buildSessionFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Contact> theContacts = session.createQuery("from Contact WHERE userId='" + userId + "'").getResultList();
		return theContacts;
	}

	@Override
	public Contact findById(int theContactId) {
		Optional<Contact> result = contactRepository.findById(theContactId);	
		Contact theContact = null;
	
		if (result.isPresent()) {
			theContact = result.get();
		}
		else {
			throw new RuntimeException("Did not find the email with id - " + theContactId);
		}
	
			return theContact;
	}

	@Override
	public void addContact(Contact theContact) {
		contactRepository.save(theContact);
	}

	@Override
	public void deleteContactById(int theContactId) {
		contactRepository.deleteById(theContactId);
	}

}
