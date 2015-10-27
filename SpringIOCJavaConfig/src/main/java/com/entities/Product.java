/**
 * 
 */
package com.entities;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	String name;
	String category;
	String price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void print() {
		System.out.println("Name=" + this.name);
		System.out.println("Category=" + this.category);
		System.out.println("Price=" + this.price);
	}

	public String toString(){
		return "Product : [name="+this.name+",category="+this.category+ ",price="+this.price+"]"; 
	}
	
}
