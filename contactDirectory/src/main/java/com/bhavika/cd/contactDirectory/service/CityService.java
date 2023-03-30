package com.bhavika.cd.contactDirectory.service;

import java.util.List;

import org.apache.catalina.connector.Response;

import com.bhavika.cd.contactDirectory.entity.City;

public interface CityService {
	
	public List<City> getCities();

	public List<City> getCitiesbyState(int stateId);
	
}
