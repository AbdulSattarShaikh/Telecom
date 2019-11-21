package com.haud.telecom.dtos;

import java.util.ArrayList;
import java.util.Collection;

import com.haud.telecom.model.Simcard;

public class CustomerDto {
	
	
	private int id;
	
	private String name;
	
	private String email;

	
	private Collection<Simcard> simcard = new ArrayList<Simcard>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Simcard> getSimcard() {
		return simcard;
	}

	public void setSimcard(Collection<Simcard> simcard) {
		this.simcard = simcard;
	}
	
	

}
