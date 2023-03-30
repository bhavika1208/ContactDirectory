package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.bhavika.cd.contactDirectory.entity.Contact;
import com.bhavika.cd.contactDirectory.entity.Email;
import com.bhavika.cd.contactDirectory.repository.ContactRepository;
import com.bhavika.cd.contactDirectory.service.ContactService;

public class ContactServiceImpl implements ContactService {

	private ContactRepository contactRepository;
	
	public ContactServiceImpl(ContactRepository theContactRepository) {
		contactRepository = theContactRepository;
	}
	
	// ************************************************************************ TO BE DONE
	@Override
	public List<Contact> findAll(int theUserId) {
//		return contactRepository.findAll(theUserId);
		return null;
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
	public void save(Contact theContact) {
		contactRepository.save(theContact);
	}

	@Override
	public void deleteById(int theContactId) {
		contactRepository.deleteById(theContactId);
	}

}
