package com.tharun.SpringFrameworkDemo.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("AutoWiringConfig.xml");
		
		//Developer dev1 = (Developer) ac.getBean("developer1");
		//dev1.code();
		
		//Laptops objects are created before they are used
		//to avoid this, we can use LAZY-INIT = true
		//using this, when we ask for it, object will be created
		
		
		//INNER BEAN in XML
		Developer dev2 = ac.getBean("developer2",Developer.class);
		dev2.code();
		
		((ClassPathXmlApplicationContext)ac).close();
		
	}
}
