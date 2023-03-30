package com.bhavika.cd.contactDirectory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavika.cd.contactDirectory.entity.City;
import com.bhavika.cd.contactDirectory.service.AddressService;
import com.bhavika.cd.contactDirectory.service.CityService;

@RestController
@RequestMapping("/cd")

public class AddressController {

	private AddressService addressService;
	
	private AddressController(AddressService theaddressService) {
		addressService = theaddressService;
	}
	

}
