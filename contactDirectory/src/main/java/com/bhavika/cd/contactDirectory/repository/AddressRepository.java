package com.bhavika.cd.contactDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavika.cd.contactDirectory.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
