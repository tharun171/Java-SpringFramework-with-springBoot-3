package com.tharun.SpringFramework_JavaBasedConfig.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tharun.SpringFramework_JavaBasedConfig.Computer;
import com.tharun.SpringFramework_JavaBasedConfig.Desktop;
import com.tharun.SpringFramework_JavaBasedConfig.Developer;
import com.tharun.SpringFramework_JavaBasedConfig.Laptop;

@Configuration
public class JavaConfig {
	
	//by default bean id is function name
	@Bean
	//@Qualifier(name is bean name) - when primary is not used - we can use any one of those
	//But we use @Qualifier more in spring
	public Developer dev1(@Autowired @Qualifier("anylap") Computer com)
	{
		Developer dev = new Developer();
		dev.setName("tarun");
		dev.setDevice(com);
		return dev;
	}

	//without being called, object will be created 
	//By Default it will be @Eager
	//to make the class created, when we need it give @Lazy
	@Lazy
	@Bean
	public Computer laptop1()
	{
		Laptop lap = new Laptop();
		lap.setLapName("Hp");
		return lap;
	}

	//can also give multiple bean names
	//@Bean(name= {"name1","name2"})
	@Bean(name = "anylap")
	@Lazy
	@Scope("prototype")
	//@Primary
	public Computer device()
	{
		Laptop lap = new Laptop();
		lap.setLapName("Any Lap");
		return lap;
	}
	
	@Bean
	//@Primary
	public Desktop desktop()
	{
		Desktop desk = new Desktop();
		desk.setName("Assembled desk");
		return desk;
		
	}
	
	@Bean
	public Desktop desktop1()
	{
		Desktop desk = new Desktop();
		desk.setName("Assembled desk1");
		return desk;
		
	}

}
