package com.diazcode.springaopin12steps;

import com.diazcode.springaopin12steps.business.Business1;
import com.diazcode.springaopin12steps.business.Business2;
import com.diazcode.springaopin12steps.business.Business3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
	Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	@Autowired
	Business3 business3;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.caculateSomething());
		logger.info(business2.caculateSomething());
		logger.info(business3.caculateSomething());
	}
}
