package com.tharun.SpringBootDemo.BusinessBeans;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
//scope to be Prototype
//As we will be working with many Students
@Scope("prototype")
public class Student {
	
	private Integer rollNo;
	private String name;
	private Integer marks;
	
	public Student()
	{
		System.out.println("student object created");
	}
	
	

}
