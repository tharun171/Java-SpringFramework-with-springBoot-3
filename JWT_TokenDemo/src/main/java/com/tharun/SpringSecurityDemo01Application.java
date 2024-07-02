package com.tharun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= "com.tharun.*")
@EnableJpaRepositories(basePackages = "com.tharun.RepositoryDAO")
public class SpringSecurityDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemo01Application.class, args);
	}

}
