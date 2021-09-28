package com.diazcode.springin5steps;

import com.diazcode.springin5steps.helper.BinarySearchimpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //This is component scanner, it'll scan in the package above for components
@ComponentScan("com.diazcode.springin5steps")
public class SpringIn5StepsApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplication.class);
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class);
		
		BinarySearchimpl binarySearchimpl = context.getBean(BinarySearchimpl.class);
		
		LOGGER.info("{}", binarySearchimpl);
	}
}
