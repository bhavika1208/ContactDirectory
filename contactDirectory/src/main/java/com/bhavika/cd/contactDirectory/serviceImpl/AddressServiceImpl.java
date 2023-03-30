package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bhavika.cd.contactDirectory.entity.Address;
import com.bhavika.cd.contactDirectory.entity.Email;
import com.bhavika.cd.contactDirectory.repository.AddressRepository;
import com.bhavika.cd.contactDirectory.service.AddressService;

public class AddressServiceImpl implements AddressService {
	
	private AddressRepository addressRepository;
	
	@Autowired	
	public AddressServiceImpl(AddressRepository theAddressRepository) {
		addressRepository = theAddressRepository;
	}

//	***************************************************************** TO BE DONE
	@Override
	public List<Address> findAll(int theContactId) {
		
		return null;
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
