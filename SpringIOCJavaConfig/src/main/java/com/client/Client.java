/**
 * 
 */
package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ProductConfig;
import com.entities.Address;
import com.entities.Customer;
import com.entities.Product;

/**
 * @author sree
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(ProductConfig.class,Customer.class, Address.class);
		ctx.refresh();

		Product p = (Product) ctx.getBean(Product.class);
		p.setCategory("Electronics");
		p.setName("IPhone6 Plus");
		p.setPrice("$1000");
		System.out.println(p.toString());
		
		Customer c = (Customer) ctx.getBean(Customer.class);
		Address a =(Address)ctx.getBean(Address.class);
		a.setCity("Hyderabad");
		c.setAddress(a);
		c.setName("Omkar");
		c.printCustomer();
	}

}
