package com.haud.telecom.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haud.telecom.dtos.SimcardDto;
import com.haud.telecom.exceptions.EntityNotFound;
import com.haud.telecom.model.Customer;
import com.haud.telecom.model.Simcard;
import com.haud.telecom.repository.CustomerRepository;
import com.haud.telecom.repository.SimcardRepository;


@Service
public class SimcardServiceImpl implements SimcardService{

	
	@Autowired	
	SimcardRepository simcardRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ModelMapper modelMapper;	

	@Override
	public Integer createSimcard(SimcardDto simcardDto, Integer custId) {
	
	Simcard simcard = modelMapper.map(simcardDto, Simcard.class);	
	
	simcard.setCustomer(customerRepository.findById(custId).orElseThrow(()-> new EntityNotFound("Customer Not Found")));
	return simcardRepository.save(simcard).getId(); 		
	
	}


	@Override
	public SimcardDto retreiveCustomerSims(Integer simcardId) {	
						
		return modelMapper.map(simcardRepository.findById(simcardId).orElseThrow(()-> new EntityNotFound("Simcard Not Found")), SimcardDto.class);
				
	}

}
