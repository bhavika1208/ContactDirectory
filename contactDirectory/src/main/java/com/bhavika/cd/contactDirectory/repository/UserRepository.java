package com.bhavika.cd.contactDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavika.cd.contactDirectory.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
