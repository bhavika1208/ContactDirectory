package com.bhavika.cd.contactDirectory.service;

import java.util.List;

import com.bhavika.cd.contactDirectory.entity.Address;

public interface AddressService {
	
	public List<Address> findAll(int theContactId);
	
	public Address findById(int theAddressId);
	
	public void save(Address theAddress);
	
	public void deleteById(int theAddressId);

}
