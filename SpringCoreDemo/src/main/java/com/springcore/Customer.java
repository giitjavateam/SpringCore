package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer implements Cart {
	
	@Autowired 
	private Order order;

	
	
	public Order getOrder() {
		return order;
	}



	public void setOrder(Order order) {
		this.order = order;
	}



	public void inCart() {
    	System.out.println("This customer has purchased "+order);
    }
}
