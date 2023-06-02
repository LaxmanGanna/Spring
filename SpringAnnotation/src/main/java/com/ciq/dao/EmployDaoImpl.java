package com.ciq.dao;

import org.springframework.stereotype.Repository;

import com.ciq.model.Employ;
@Repository
public class EmployDaoImpl implements EmployDao {

	public void save(Employ employ) {
		System.out.println("Employ dao implementation");
		
	}

}
