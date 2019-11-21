package com.haud.telecom.service;

import org.springframework.stereotype.Service;

import com.haud.telecom.dtos.CustomerDto;

@Service
public interface CustomerService {

	Integer createCustomer(CustomerDto customerDto);

	CustomerDto retrieveCustomer(Integer custId);

}
