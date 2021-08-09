package com.springcore.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Order;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/customerbean.xml");
		//Customer customer=(Customer)context.getBean("customerObject");
		Order obj = (Order)context.getBean("order");
		//obj.inCart();
		System.out.println(obj);
		
	}

}
