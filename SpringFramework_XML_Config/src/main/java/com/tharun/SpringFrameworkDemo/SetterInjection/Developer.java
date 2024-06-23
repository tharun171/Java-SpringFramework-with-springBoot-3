package com.tharun.SpringFrameworkDemo.SetterInjection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Developer {
	

	private int age;
	
	private Computer lap;
	
	public Developer()
	{
		System.out.println("Developer Object Created");
	}

	public void code()
	{
		System.out.println("Developer codes");
		System.out.println(age);
		lap.compile();
	}
}
