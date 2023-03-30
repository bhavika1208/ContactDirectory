package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.hibernate.context.spi.CurrentSessionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavika.cd.contactDirectory.entity.City;
import com.bhavika.cd.contactDirectory.entity.State;
import com.bhavika.cd.contactDirectory.repository.CityRepository;
import com.bhavika.cd.contactDirectory.service.CityService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.websocket.Session;


@Service
public class CityServiceImpl implements CityService {
	
	private CityRepository cityRepository;
	private final EntityManagerFactory emf;
	
	@Autowired
	public CityServiceImpl(CityRepository thecityRepository, EntityManagerFactory emf) {
		this.emf = emf;
		cityRepository = thecityRepository;
	}
	
	@Override
	public List<City> getCities() {
		return cityRepository.findAll();
	}

	@Override
	public List<City> getCitiesbyState(int stateId) {
		
//		Session currentSession = entityManager.unwrap(Session.class);
//		
//		Query theQuery = currentSession.createQuery("from city where stateId=:citystateId", City.class);
////		Query theQuery = entityManager.createQuery("from city where stateId=:citystateId");
//		
//		theQuery.setParameter("citystateId", stateId);
//		
//		return theQuery.getResultList();
		
		EntityManager entityManager = emf.createEntityManager();
		String hql = "FROM City C WHERE C.citystateId =: citystateId";
        Query query = entityManager.createQuery(hql);

//        Query query = entityManager.createQuery("from city where citystateId=:citystateId");
        query.setParameter("citystateId", stateId);
        return query.getResultList();
		
	}
	
	


}
