package com.tharun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopSbApplication.class, args);
	}

}
