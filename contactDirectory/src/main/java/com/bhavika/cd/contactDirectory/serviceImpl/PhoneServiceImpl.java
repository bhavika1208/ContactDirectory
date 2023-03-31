package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.bhavika.cd.contactDirectory.entity.City;
import com.bhavika.cd.contactDirectory.entity.Phone;
import com.bhavika.cd.contactDirectory.repository.PhoneRepository;
import com.bhavika.cd.contactDirectory.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService {

	private PhoneRepository phoneRepository;
	
	public PhoneServiceImpl(PhoneRepository thephoneRepository) {
		phoneRepository = thephoneRepository;
	}
	
//	*******************************************************************     TO BE DONE / check
	@Override
	public List<Phone> findAll(int contactId) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Phone.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Phone> thePhones = session.createQuery("from City WHERE cityStateId='" + contactId + "'").getResultList();
		return thePhones;
	}


	@Override
	public Phone findById(int thePhoneId) {
		
		Optional<Phone> result = phoneRepository.findById(thePhoneId);
		
		Phone thePhone = null;
		
		if (result.isPresent()) {
			thePhone = result.get();
		}
		else {
			throw new RuntimeException("Did not find the phone with id - " + thePhoneId);
		}
		
		return thePhone;
	}

	@Override
	public void save(Phone thePhone) {
		phoneRepository.save(thePhone);
	}

	@Override
	public void deleteById(int thePhoneId) {
		phoneRepository.deleteById(thePhoneId);
	}
}
