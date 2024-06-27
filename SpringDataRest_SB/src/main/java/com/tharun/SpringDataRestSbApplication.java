package com.tharun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestSbApplication.class, args);
		
		/*
		 * IN POSTMAN
		 * search with localhost:9090/ to get all endpoints
		 * get all - http://localhost:9090/fresherEntities
		 * get by id - http://localhost:9090/fresherEntities/198825
		 * post - http://localhost:9090/fresherEntities
		 * put - http://localhost:9090/fresherEntities/198829 this id gets updated
		 * delete - http://localhost:9090/fresherEntities/198829 - this id gets deleted
		 */
	}

}
