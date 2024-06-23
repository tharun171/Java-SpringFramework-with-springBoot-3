package com.tharun.SpringFrameworkDemo.SetterInjection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Laptop implements Computer{
	
	private String name;
	
	public Laptop()
	{
		System.out.println("Laptop class created");
	}

	@Override
	public void compile()
	{
		System.out.println("laptop Compiling code");
		System.out.println("laptop name "+name);
	}
}
