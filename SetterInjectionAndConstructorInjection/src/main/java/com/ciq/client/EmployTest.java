package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.model.Employ;

public class EmployTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Employ employ=(Employ) context.getBean("massage");
		System.out.println(employ);
	}

}
