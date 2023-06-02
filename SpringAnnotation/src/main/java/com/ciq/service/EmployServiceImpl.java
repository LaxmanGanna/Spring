package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployDaoImpl;
import com.ciq.model.Employ;
@Service
public class EmployServiceImpl implements EmployService{

	@Autowired
	private EmployDaoImpl daoimpl;
	
	
	/**
	 * @param daoimpl the daoimpl to set
	 */
	public void setDaoimpl(EmployDaoImpl daoimpl) {
		this.daoimpl = daoimpl;
	}


	public void save(Employ employ) {
		System.out.println("Employ service implementation");
		daoimpl.save(employ);
	}

}
