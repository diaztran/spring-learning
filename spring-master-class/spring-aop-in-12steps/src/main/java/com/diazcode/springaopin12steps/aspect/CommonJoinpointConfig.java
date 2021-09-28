package com.diazcode.springaopin12steps.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinpointConfig {
	@Pointcut("execution(* com.diazcode.springaopin12steps.dao.*.*(..))")
	public void dataLayerExecution() {
	}
	
	@Pointcut("execution(* com.diazcode.springaopin12steps.business.*.*(..))")
	public void businessLayerExecution() {
	}

//	We can even intercept 2 or more layer at the same time
	@Pointcut("com.diazcode.springaopin12steps.aspect.CommonJoinpointConfig.dataLayerExecution() && " +
			"com.diazcode.springaopin12steps.aspect.CommonJoinpointConfig.businessLayerExecution()")
	public void dataAndBusinessLayerExcution(){}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao(){}
	
	@Pointcut("within(com.diazcode.springaopin12steps.dao..*)")
	public void dataLayerExcutionWithWithin(){}
	
//	Define a custom Annotation
	@Pointcut("@annotation(com.diazcode.springaopin12steps.aspect.TrackTime)")
	public void trackTimeAnnotation(){}
}
