package com.diazcode.springaopin12steps.business;

import com.diazcode.springaopin12steps.dao.Dao2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
	@Autowired
	Dao2 dao2;
	
	public String caculateSomething(){
		return dao2.retrieveSomething();
	}
}
