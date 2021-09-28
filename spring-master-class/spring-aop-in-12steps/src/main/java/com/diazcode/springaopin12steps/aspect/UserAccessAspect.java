package com.diazcode.springaopin12steps.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Before("com.diazcode.springaopin12steps.aspect.CommonJoinpointConfig.dataLayerExecution()")
//	@Before("execution(* com.diazcode.springaopin12steps.business.*.*(..))")
	public void before(JoinPoint joinPoint){
		// advice
		logger.info("Checking for user access...");
		logger.info("Allowed execution for - {}", joinPoint);
	}
}
