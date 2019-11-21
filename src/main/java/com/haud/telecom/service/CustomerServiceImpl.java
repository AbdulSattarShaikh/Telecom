package com.haud.telecom.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haud.telecom.dtos.CustomerDto;
import com.haud.telecom.exceptions.EntityNotFound;
import com.haud.telecom.model.Customer;
import com.haud.telecom.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;		
	
	@Autowired
	ModelMapper modelMapper;
	
	
	@Override
	public Integer createCustomer(CustomerDto customerDto) {		
		
		return customerRepository.save(modelMapper.map(customerDto, Customer.class)).getId(); 
	}
		
	
	@Override
	public CustomerDto retrieveCustomer(Integer custId) {	
	
	return modelMapper.map(customerRepository.findById(custId).orElseThrow(()-> new EntityNotFound("Customer Not Found")), CustomerDto.class);
		
		
	}

}
