package com.haud.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haud.telecom.dtos.CustomerDto;
import com.haud.telecom.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	
	@PostMapping("/create")
	public ResponseEntity<Integer> createCustomer(@RequestBody CustomerDto customerDto){		
				
		return new ResponseEntity<>(customerService.createCustomer(customerDto) , HttpStatus.CREATED);	
					
	}
	
	
	@GetMapping("/retrieveCustomer/{custId}")
	public ResponseEntity<CustomerDto> retrieveCustomer(@PathVariable Integer custId){		
	
		return new ResponseEntity<>(customerService.retrieveCustomer(custId), HttpStatus.OK);
		
	}
	
	

}
