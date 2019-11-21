package com.haud.telecom.dtos;

import com.haud.telecom.model.Customer;

public class SimcardDto {
	
	
	private Integer id;
	private Integer sIMNumber;
	private Integer iMSINumber;
	private Customer customer;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getsIMNumber() {
		return sIMNumber;
	}
	public void setsIMNumber(Integer sIMNumber) {
		this.sIMNumber = sIMNumber;
	}
	public Integer getiMSINumber() {
		return iMSINumber;
	}
	public void setiMSINumber(Integer iMSINumber) {
		this.iMSINumber = iMSINumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
