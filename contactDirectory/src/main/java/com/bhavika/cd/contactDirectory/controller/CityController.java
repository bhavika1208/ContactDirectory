package com.bhavika.cd.contactDirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavika.cd.contactDirectory.entity.City;
import com.bhavika.cd.contactDirectory.service.CityService;


@RestController
@RequestMapping("/cd")
public class CityController {
	
	private CityService cityService;
	
	@Autowired
	private CityController(CityService thecityService) {
		cityService = thecityService;
	}
	
		@GetMapping("/cities")
		public List<City> findAll() {
			return cityService.getCities();
		}
		
		@GetMapping("/city/{stateId}")
		public List<City> findbyId(@PathVariable int stateId) {
			List<City> theCity = cityService.getCitiesbyState(stateId);
			
			return theCity;
		}

}
