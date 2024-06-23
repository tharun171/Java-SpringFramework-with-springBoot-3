package com.tharun.SpringFramework_StereoTypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//it will be the bean name
@Component("desktop1")
@Getter
@Setter
@ToString
@Primary
@Scope("prototype")
public class Desktop implements Computer{
	
	//name = "Assembled desktop";
	//instead of this we can give
	@Value("Assembled desktop - Rog")
	private String name;

	@Override
	public void compile() {
		System.out.println("Desktop is compiling");
		
		System.out.println("Desktop name: "+name);
	}

}
