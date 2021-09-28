package com.diazcode.springaopin12steps.dao;

import com.diazcode.springaopin12steps.aspect.TrackTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@TrackTime
	public String retrieveSomething(){
		return "Dao1";
	}
}
