/**
 * 
 */
package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entities.Address;
import com.entities.Customer;
import com.entities.Product;

@Configuration
public class ProductConfig {

	@Bean
	public Product product() {
		return new Product();
	}

	@Bean
	public Customer customer() {
		return new Customer();
	}

	@Bean
	public Address address() {
		return new Address();
	}

}
