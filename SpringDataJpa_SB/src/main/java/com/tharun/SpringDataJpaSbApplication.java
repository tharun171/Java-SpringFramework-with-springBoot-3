package com.tharun;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tharun.Entities.FresherEntity;
import com.tharun.serviceDTO.ProjectService;

@SpringBootApplication
public class SpringDataJpaSbApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(SpringDataJpaSbApplication.class, args);
		
		ProjectService service = ac.getBean("projectServiceImpl",ProjectService.class);
		
		findByName(service,"tarun");
		
		
		
	}

	public static void findByName(ProjectService service,String name)
	{
		List<FresherEntity> list = service.findByName(name);
		System.out.println(list);
	}
}
