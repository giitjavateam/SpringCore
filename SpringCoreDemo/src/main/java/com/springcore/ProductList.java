package com.springcore;

import org.springframework.stereotype.Component;

@Component
public class ProductList implements Cart {
	
	public void inCart() {
		System.out.println("Product Class");
	}
}
