package com.tharun.SpringFrameworkDemo.Autowiring;

import com.tharun.SpringFrameworkDemo.SetterInjection.Computer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Developer {
	
	private String name;
	
	private Computer comp;
	
	public void code()
	{
		System.out.println("dev name "+name);
		System.out.println("Developer codes");
		comp.compile();
	}

}
