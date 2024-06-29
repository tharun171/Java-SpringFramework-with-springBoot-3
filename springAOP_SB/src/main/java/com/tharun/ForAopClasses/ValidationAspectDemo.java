package com.tharun.ForAopClasses;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspectDemo {

	private static final Logger log= LoggerFactory.getLogger(LoggingAspect.class);
	
	//getting id from user for get/id
	@Around("execution(* com.tharun.serviceDTO.ProjectServiceImpl.*(..)) && args(userId)")
	public Object getExecutionTimeForServiceImpl(ProceedingJoinPoint jp,
			int userId) throws Throwable
	{
		log.info("log --> user gave "+userId);
		if(userId<0)
			userId = -userId;
		log.info("log --> we changed it to "+userId);
		log.info("log--> changed from neg value to positive value");
		Object obj = jp.proceed(new Object[]{userId});
		return obj;
	}
}
