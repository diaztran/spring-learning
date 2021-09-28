package com.diazcode.springaopin12steps.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterUserAccessAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(value = "execution(* com.diazcode.springaopin12steps.business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} have returned value {}", joinPoint, result);
	}
	
	@AfterThrowing(value = "execution(* com.diazcode.springaopin12steps.business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Exception exception) {
		logger.info("{} have returned value {}", joinPoint, exception);
	}
	
	@After(value = "execution(* com.diazcode.springaopin12steps.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("After execution of {}", joinPoint);
	}
}
