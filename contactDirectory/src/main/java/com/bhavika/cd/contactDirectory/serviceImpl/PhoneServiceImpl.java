package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.bhavika.cd.contactDirectory.entity.Phone;
import com.bhavika.cd.contactDirectory.repository.PhoneRepository;
import com.bhavika.cd.contactDirectory.service.PhoneService;

public class PhoneServiceImpl implements PhoneService {

	private PhoneRepository phoneRepository;
	
	public PhoneServiceImpl(PhoneRepository thephoneRepository) {
		phoneRepository = thephoneRepository;
	}
	
//	*******************************************************************     TO BE DONE
	@Override
	public List<Phone> findAll(int theContactId) {
		return null;
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
