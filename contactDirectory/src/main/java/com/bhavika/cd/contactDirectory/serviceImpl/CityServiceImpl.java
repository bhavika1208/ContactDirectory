package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavika.cd.contactDirectory.entity.City;
import com.bhavika.cd.contactDirectory.repository.CityRepository;
import com.bhavika.cd.contactDirectory.service.CityService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;

@Service
public class CityServiceImpl implements CityService {

	private CityRepository cityRepository;

	@Autowired
	public CityServiceImpl(CityRepository thecityRepository) {
		cityRepository = thecityRepository;
	}

	@Override
	public List<City> getCities() {
		return cityRepository.findAll();
	}

	@Override
	public List<City> getCitiesbyState(int stateId) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<City> theCities = session.createQuery("from City WHERE cityStateId='" + stateId + "'").getResultList();
		return theCities;
	}

}
