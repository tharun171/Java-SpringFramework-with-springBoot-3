package com.tharun.SpringFrameworkDemo.SetterInjection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Desktop implements Computer{
	
	private String name;

	@Override
	public void compile() {
		System.out.println("compiling is being done on desktop");
		System.out.println("Desktop name: "+name);
	}

	
}
