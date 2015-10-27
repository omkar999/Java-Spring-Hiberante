/**
 * 
 */
package com.entities;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String city ;

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
