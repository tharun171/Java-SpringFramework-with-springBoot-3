package com.tharun.ServletDemo;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import com.tharun.ServletDemo.Servlets.HelloServlet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        
        Tomcat tomcat = new Tomcat();
       tomcat.setPort(8080);
        
        //Creating Context object
        Context context = tomcat.addContext("", null);
        tomcat.addServlet(context,"HelloServletKey",new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServletKey");
        
        //Starting the server
        tomcat.start();
        //Asking to server to await - for not closing automatically
        tomcat.getServer().await();
        
       /*
        * 
        * http://localhost:8080/hello
        */
        
    }
}
