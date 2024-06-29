package com.tharun.ForAopClasses;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.tharun.Entities.FresherEntity;


@Component
@Aspect
public class LoggingAspect {

	//any method invoked in service class
	//we want to have log
	
	private static final Logger log= LoggerFactory.getLogger(LoggingAspect.class);
	
	
	
	//@Before("execution(*)") //for all methods
	
	//for specific
	//we need to mention - return type, className with package, method name(args)
	
	
	//for all methods that are in serviceimpl
	@Before("execution(* com.tharun.serviceDTO.ProjectServiceImpl.*(..))")
	public void forAllMethodsInServiceImpl()
	{
		log.info("log--> runs before executing any method in serviceImpl");
	}
	
	
	
	//writing for getAllfresher in serviceImpl
	@Before("execution(java.util.List<com.tharun.Entities.FresherEntity> com.tharun.serviceDTO.ProjectServiceImpl.getAllFresher(..))")
	//we can write for 2 methods using or ||
	//using JoinPoint to get values
	public void logMethodCall(JoinPoint jp)
	{
		log.info("log --> Before()advice execute before the method");
		log.info("log --> getAllFresher() Method called in service, method Name: "+jp.getSignature().getName());
	}
	
	
	//Executes after the method is called
	@After("execution(java.util.List<com.tharun.Entities.FresherEntity> com.tharun.serviceDTO.ProjectServiceImpl.getAllFresher(..))")
	//we can write for 2 methods using or ||
	//using JoinPoint to get values
	public void AfterlogMethodCall(JoinPoint jp)
	{
		log.info("log --> After()advice execute after the method");
		log.info("log --> getAllFresher() Method called in service, method Name: "+jp.getSignature().getName());
	}
	
	//After throwing an error we want to show this
	//for all methods in service impl
	@AfterThrowing("execution(* com.tharun.serviceDTO.ProjectServiceImpl.*(..))")
	public void AfterThrowingMethodDemo(JoinPoint jp)
	{
		log.info("log --> AfterThrowing() method calls when we have a error");
		log.info("log--> we used getbyid method in service impl by printing 5/0");
		log.info("log -->showcasing where we got error using joinpoint: "+jp.getSignature().getName());
	}
	
	//after the method is runned successfully
	//at first the AfterReturin() method is shown
	//Then the After) method is shown
	@AfterReturning("execution(* com.tharun.serviceDTO.ProjectServiceImpl.*(..))")
	public void AfterReturningMethodDemo(JoinPoint jp)
	{
		log.info("log --> AfterReturning() method called when method execute success");
		log.info("log --> showing method name using join point: "+jp.getSignature().getName());
	}
	
}
