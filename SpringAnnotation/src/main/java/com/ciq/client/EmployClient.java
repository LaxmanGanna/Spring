package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployControllerImpl;
import com.ciq.model.Employ;

public class EmployClient {

	public static void main(String[] args) {
		
		Employ e=new Employ(1, "jithu", 25000.00);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		EmployControllerImpl eci=context.getBean(EmployControllerImpl.class,"laxman");
		eci.save(e);
		
	}

}
