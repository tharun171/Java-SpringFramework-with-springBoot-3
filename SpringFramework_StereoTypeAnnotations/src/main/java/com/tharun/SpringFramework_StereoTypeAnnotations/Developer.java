package com.tharun.SpringFramework_StereoTypeAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Developer {
	
	private String name;
	
	
	@Autowired
	//we found 2 beans - laptop and desktop - to solve this
	//first way - give @Component on ClassLevel
	//second way - use @qualifier(name) with name as @component name
	private Computer comp;
	
	public void code()
	{
		System.out.println("developer name "+name);
		System.out.println("developer will code");
		comp.compile();
	}

}
