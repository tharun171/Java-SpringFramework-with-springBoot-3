package com.tharun.SpringFramework_JavaBasedConfig;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Developer {
	
	private String name;
	
	private Computer device;
	
	public Developer()
	{
		System.out.println("Developer class invoked");
	}
	
	public void code()
	{
		System.out.println("Developer codes");
		device.compile();
	}

}
