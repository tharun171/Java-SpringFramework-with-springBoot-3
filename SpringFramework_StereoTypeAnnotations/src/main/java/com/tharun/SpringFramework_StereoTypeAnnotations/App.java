package com.tharun.SpringFramework_StereoTypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        Developer dev = ac.getBean("developer",Developer.class);
        dev.setName("tarun");
        dev.code();
        
        
        ((AnnotationConfigApplicationContext)ac).close();
    }
}
