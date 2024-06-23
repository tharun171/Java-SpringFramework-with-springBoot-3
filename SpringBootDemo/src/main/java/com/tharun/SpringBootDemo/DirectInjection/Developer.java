package com.tharun.SpringBootDemo.DirectInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
		
	@Autowired
	public Laptop lap;

	public void code()
	{
		System.out.println("developer does Coding...");
		lap.compile();
	}
}
