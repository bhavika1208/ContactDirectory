package com.bhavika.cd.contactDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavika.cd.contactDirectory.entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {

}
