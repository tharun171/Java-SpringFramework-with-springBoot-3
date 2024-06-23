package com.tharun.SpringBootDemo.DirectInjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	public void laptopName()
	{
		System.out.println("Asus was given - 8GB");
	}
	
	public void compile()
	{
		System.out.println("Compiling code....");
	}
}
