package com.ciq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;

import com.ciq.model.Employ;
import com.ciq.service.EmployServiceImpl;
@Controller("laxman")
public class EmployControllerImpl implements EmployController{

	@Autowired
	private EmployServiceImpl serviceimpl;
	
	
	/**
	 * @param serviceimpl the serviceimpl to set
	 */
	public void setServiceimpl(EmployServiceImpl serviceimpl) {
		this.serviceimpl = serviceimpl;
	}

	Logger l=LoggerFactory.getLogger(EmployControllerImpl.class);

	public void save(Employ employ) {
		l.info("before insert{}");
		System.out.println("Employ controller implementation");
		serviceimpl.save(employ);
		l.info("after insert{}",employ);
		
	}
	
	

}
