package com.tharun.SpringFrameworkDemo.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Configuration2.xml");
		
		 //CONSTRUCTOR Injection
        //Architect arch = (Architect) ac.getBean("architectConst1");
        //System.out.println(arch.toString());
        
        //CONSTRUCTOR Injection = INDEX = index start with 0 
        //first variable in constructor is 0, then second 1
        //Architect arch = (Architect) ac.getBean("architectConst2");
        //System.out.println(arch.toString());
        
        //CONSTRUCTOR Injection = Name = name as per in class
        Architect arch = (Architect) ac.getBean("architectConst3");
        System.out.println(arch.toString());
        
        ((ClassPathXmlApplicationContext)ac).close();
	}

}
