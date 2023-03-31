package com.bhavika.cd.contactDirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavika.cd.contactDirectory.entity.Address;
import com.bhavika.cd.contactDirectory.service.AddressService;


@RestController
@RequestMapping("/cd")
public class AddressController {

	private AddressService addressService;
	
	@Autowired
	private AddressController(AddressService theaddressService) {
		addressService = theaddressService;
	}
	
//	public List<Address> findAll(int theContactId);
//	public Address findById(int theAddressId);	
//	public void save(Address theAddress);
//	public void deleteById(int theAddressId);
	
	
	@GetMapping("/address/{contactId}")
	public List<Address> findAll(@PathVariable int contactId){
		List<Address> theAddress = addressService.findAll(contactId);
		return theAddress;
	}
	
	
	@GetMapping("/address/{emailId}")
	public Address findById(@PathVariable int addressId) {
		Address theAddress = addressService.findById(addressId);
		 return theAddress;
	}
	
	@PostMapping("/address")
	public Address addEmail(@RequestBody Address theAddress){
		theAddress.setContactId(0);
		addressService.save(theAddress);
		return theAddress;
	}
	
	@PutMapping("/address")
	public Address updatEmail(@RequestBody Address theAddress){
		addressService.save(theAddress);
		return theAddress;
	}
	
	@DeleteMapping("/address/{addressId}")
	public String deleteEmail(@PathVariable int addressId) {
		
		Address theAddress = addressService.findById(addressId);
		if(theAddress==null) {
			return "No such mail exist";
		}
		addressService.deleteById(addressId);
		return "Mail deleted successfully";
	}
	

}
