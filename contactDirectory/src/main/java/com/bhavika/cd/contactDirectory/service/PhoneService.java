package com.bhavika.cd.contactDirectory.service;

import java.util.List;
import com.bhavika.cd.contactDirectory.entity.Phone;

public interface PhoneService {
	
	public List<Phone> findAll(int theContactId);
	
	public Phone findById(int thePhoneId);
	
	public void save(Phone thePhone);
	
	public void deleteById(int thePhoneId);

}
