package com.haud.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haud.telecom.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	
	

}
