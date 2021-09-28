package com.diazcode.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalServices {
	
	// We will get it from an external property file
	@Value("${external.someservice.url}")
	private String url;

	public String getUrlFromExFile(){
		return this.url;
	}
}
