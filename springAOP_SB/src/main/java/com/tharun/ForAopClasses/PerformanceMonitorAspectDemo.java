package com.tharun.ForAopClasses;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspectDemo {

	private static Logger log = LoggerFactory.getLogger(PerformanceMonitorAspectDemo.class);
	
	
	//we want this method to run
	//after starting the method and
	//before ending the method
	
	//we want this method for serviceImpl classes in service impl
	@Around("execution(* com.tharun.serviceDTO.ProjectServiceImpl.*(..))")
	public Object getExecutionTimeForServiceImpl(ProceedingJoinPoint jp) throws Throwable
	{
		long start = System.currentTimeMillis();
		Object obj = jp.proceed();
		//without returning jp.proceed()
		//methods wont show value, gives run
		long end = System.currentTimeMillis();
		log.info("log --> time taken for executing methodName: "+jp.getSignature().getName()+" time: "+(end-start)+" milliseconds");
		return obj;
	}
	
}
