package com.diazcode.springaopin12steps.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String retrieveSomething(){
		return "Dao2";
	}
}
