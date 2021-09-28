package com.seancode.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepsApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		
//		Get all beans that were created in compile-time
//		for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(beanDefinitionName);
//		}
	}
	
}
