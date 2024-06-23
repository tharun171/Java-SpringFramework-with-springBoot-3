package com.tharun.SpringFrameworkDemo.ConstructorInjection;

import com.tharun.SpringFrameworkDemo.SetterInjection.Computer;
import com.tharun.SpringFrameworkDemo.SetterInjection.Laptop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Architect {

	private String name;
	private String role;
	private int age;
	private double salary;
	private Computer lap;
	
	public Architect()
	{
		System.out.println("Architect class called");
	}

	public Architect(String name, String role, int age, Double salary, Computer lap) {
		super();
		this.name = name;
		this.role = role;
		this.age = age;
		this.salary = salary;
		this.lap = lap;
	}
	
	public Architect(int age,String role,String name,Double salary, Computer lap) {
		super();
		this.name = name;
		this.role = role;
		this.age = age;
		this.salary = salary;
		this.lap = lap;
	}
	
}
