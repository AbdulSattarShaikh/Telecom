package com.haud.telecom.service;

import org.springframework.stereotype.Service;

import com.haud.telecom.dtos.SimcardDto;

@Service
public interface SimcardService {

	Integer createSimcard(SimcardDto simcardDto, Integer custId);

	SimcardDto retreiveCustomerSims(Integer simcardId);
	

	
	
	

}
