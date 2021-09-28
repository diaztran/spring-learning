package com.diazcode.springin5steps;

import com.diazcode.springin5steps.CDI.SomeCDI;
import com.diazcode.springin5steps.CDI.SomeCDIDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.diazcode.springin5steps")
@Configuration //This is component scanner, it'll scan in the package above for components
public class SpringIn5StepsCDIApplication {
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);
	
	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(SpringIn5StepsCDIApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsCDIApplication.class);
		
		
		SomeCDIDAO someCDIDAO = context.getBean(SomeCDIDAO.class);
		SomeCDI someCDI = context.getBean(SomeCDI.class);

		LOGGER.info("{}, SomeCDI dependency was injected: {}", someCDI, someCDI.getSomeCDIDAO());
		LOGGER.info("{}", someCDIDAO);
	}
}
