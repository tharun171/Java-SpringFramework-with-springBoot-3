package com.tharun.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.tharun.SpringBootDemo.DirectInjection.Developer;

@SpringBootApplication
@ComponentScan(basePackages = "com.tharun")
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		
	//SpringApplication.run(SpringBootDemoApplication.class, args);
	
	System.out.println("Hello world");
	
	//DIRECT INJECTION
	ApplicationContext ac = SpringApplication.run(SpringBootDemoApplication.class, args);
	//Developer dev = (Developer)ac.getBean("developer");
	Developer dev = (Developer)ac.getBean(Developer.class);
	dev.code();
	
	
	//AUTOWIRING
	dev.lap.laptopName();
	
	
	}

}
