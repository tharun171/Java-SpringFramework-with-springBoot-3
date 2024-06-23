package com.tharun.SpringFrameworkDemo.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //In classpath we are giving xml - src/main
        //By default it searches for xml in resources folder
        //src/main/resources
        ApplicationContext ac = new ClassPathXmlApplicationContext("Configuration.xml");
        
        /*
        //Same bean id name as in xml
        Developer dev = (Developer)ac.getBean("developer1");
        dev.code();
        Laptop lap = (Laptop)ac.getBean("laptop");
        lap.compile();
        */
        
        /*
        //2 objects with different data
        //Both objects share same data
        Developer dev1 = (Developer)ac.getBean("developer1");
        dev1.age = 22;
        dev1.code();
        Developer dev2 = (Developer)ac.getBean("developer1");
        dev2.code();
        */
        
        /*
        //Prototype - change scope for developer as prototype
        //2 different objects are created for every object creation
        Developer dev1 = (Developer)ac.getBean("developer1");
        dev1.setAge(22);
        dev1.code();
        Developer dev2 = (Developer)ac.getBean("developer1");
        dev2.code();
        */
        
        //Setter Injection
        //setting default age
        Developer dev1 = (Developer)ac.getBean("developer1");
        dev1.code();
        
       
        
        //Closing Application Context
        ((ClassPathXmlApplicationContext)ac).close();
    }
}
