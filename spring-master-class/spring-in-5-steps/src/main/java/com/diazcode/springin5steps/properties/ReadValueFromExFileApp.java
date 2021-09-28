package com.diazcode.springin5steps.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //This is component scanner, it'll scan in the package above for components
@ComponentScan("com.diazcode.springin5steps")
@PropertySource("classpath:1stExFile.properties")
public class ReadValueFromExFileApp {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ReadValueFromExFileApp.class);
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ReadValueFromExFileApp.class);
		
		// Get service beans
		SomeExternalServices someExternalServices = context.getBean(SomeExternalServices.class);
		
		LOGGER.info("{}", someExternalServices);
		LOGGER.info("{}", someExternalServices.getUrlFromExFile());
		System.out.println(someExternalServices.getUrlFromExFile());
	}
}
