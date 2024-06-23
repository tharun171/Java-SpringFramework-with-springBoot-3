package com.tharun.SpringFramework_JavaBasedConfig;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Desktop implements Computer{

	private String name;
	
	@Override
	public void compile() {
		System.out.println("Desktop is compiling");
		System.out.println("Desktop name: "+name);
	}

}
