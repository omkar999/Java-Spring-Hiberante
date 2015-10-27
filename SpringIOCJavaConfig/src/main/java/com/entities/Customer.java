package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	String name;
	
	@Autowired
	Address address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printCustomer(){
		System.out.println("Customer Name="+name);
		System.out.println("Customer Address="+address. city);
	}
	
}
