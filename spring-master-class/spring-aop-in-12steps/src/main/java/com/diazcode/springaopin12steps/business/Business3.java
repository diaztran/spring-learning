package com.diazcode.springaopin12steps.business;

import com.diazcode.springaopin12steps.dao.Dao1;
import com.diazcode.springaopin12steps.dao.Dao3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business3 {
	@Autowired
	Dao3 dao3;
	
	public String caculateSomething(){
		return dao3.retrieveSomething();
	}
}
