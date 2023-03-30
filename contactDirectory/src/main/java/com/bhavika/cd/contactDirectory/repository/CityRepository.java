package com.bhavika.cd.contactDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavika.cd.contactDirectory.entity.City;

public interface CityRepository extends JpaRepository<City, Integer> {
	
}
