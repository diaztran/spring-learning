package com.diazcode.springin5steps;

import com.diazcode.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //This is component scanner, it'll scan in the package above for components
@ComponentScan("com.diazcode.springin5steps")
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		PersonDAO personDAO2 = context.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
	}
}
