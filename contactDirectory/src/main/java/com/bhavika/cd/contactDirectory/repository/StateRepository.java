package com.bhavika.cd.contactDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavika.cd.contactDirectory.entity.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
