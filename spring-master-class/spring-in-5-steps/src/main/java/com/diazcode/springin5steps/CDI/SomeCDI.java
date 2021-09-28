package com.diazcode.springin5steps.CDI;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCDI {
	@Autowired
	SomeCDIDAO someCDIDAO;
	
	public SomeCDI(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
	
	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}
	
	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
}
