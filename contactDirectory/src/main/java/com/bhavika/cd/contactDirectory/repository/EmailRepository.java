package com.bhavika.cd.contactDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavika.cd.contactDirectory.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Integer> {

}
