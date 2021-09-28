package com.diazcode.springin5steps;

import componentscan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration //This is component scanner, it'll scan in the package above for components
@ComponentScan("componentscan")
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
		
		ComponentPersonDAO componentPersonDAO = context.getBean(ComponentPersonDAO.class);
		
		LOGGER.info("{}", componentPersonDAO);
	}
}
