package com.tharun.SpringFramework_JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tharun.SpringFramework_JavaBasedConfig.resources.JavaConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println( "Hello World!" );
        
        Developer dev1 = ac.getBean("dev1",Developer.class);
        dev1.code();
        
        
        ((AnnotationConfigApplicationContext)ac).close();
    }
}
