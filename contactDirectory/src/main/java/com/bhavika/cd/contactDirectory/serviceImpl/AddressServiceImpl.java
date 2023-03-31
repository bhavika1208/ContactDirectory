package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bhavika.cd.contactDirectory.entity.Address;
import com.bhavika.cd.contactDirectory.entity.City;
import com.bhavika.cd.contactDirectory.entity.Email;
import com.bhavika.cd.contactDirectory.repository.AddressRepository;
import com.bhavika.cd.contactDirectory.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	
	private AddressRepository addressRepository;
	
	@Autowired	
	public AddressServiceImpl(AddressRepository theAddressRepository) {
		addressRepository = theAddressRepository;
	}

//	***************************************************************** TO BE DONE
	@Override
	public List<Address> findAll(int contactId) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Address.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Address> theAddresses = session.createQuery("from City WHERE cityStateId='" + contactId + "'").getResultList();
		return theAddresses;
	}

	@Override
	public Address findById(int theAddressId) {
		Optional<Address> result = addressRepository.findById(theAddressId);	
		Address theAddress = null;
	
		if (result.isPresent()) {
			theAddress = result.get();
		}
		else {
			throw new RuntimeException("Did not find the email with id - " + theAddressId);
		}
	
			return theAddress;
	}

	@Override
	public void save(Address theAddress) {
		addressRepository.save(theAddress);
	}

	@Override
	public void deleteById(int theAddressId) {
		addressRepository.deleteById(theAddressId);
	}

}
