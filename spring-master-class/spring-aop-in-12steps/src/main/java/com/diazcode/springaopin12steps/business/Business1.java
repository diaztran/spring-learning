package com.diazcode.springaopin12steps.business;

import com.diazcode.springaopin12steps.dao.Dao1;
import com.diazcode.springaopin12steps.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
	@Autowired
	Dao1 dao1;
	
	public String caculateSomething(){
		return dao1.retrieveSomething();
	}
}
