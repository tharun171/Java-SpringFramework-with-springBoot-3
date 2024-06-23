package com.tharun.SpringFramework_JavaBasedConfig;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Laptop implements Computer{
	
	private String lapName;
	
	public Laptop()
	{
		System.out.println("Laptop constructor invoked");
	}

	@Override
	public void compile() {
		System.out.println("Laptop compiles the code");
		System.out.println("laptop name: "+lapName);
	}

}
