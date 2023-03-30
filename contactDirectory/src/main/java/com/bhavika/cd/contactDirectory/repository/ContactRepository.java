package com.bhavika.cd.contactDirectory.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavika.cd.contactDirectory.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
