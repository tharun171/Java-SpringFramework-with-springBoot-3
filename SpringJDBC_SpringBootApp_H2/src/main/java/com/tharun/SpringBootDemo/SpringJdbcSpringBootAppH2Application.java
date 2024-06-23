package com.tharun.SpringBootDemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.tharun.SpringBootDemo.BusinessBeans.Student;
import com.tharun.SpringBootDemo.Dto.StudentService;

@SpringBootApplication
@ComponentScan(basePackages ="com.tharun.SpringBootDemo")
public class SpringJdbcSpringBootAppH2Application {

	public static void main(String[] args) {
		
		//SpringApplication.run(SpringJdbcSpringBootAppH2Application.class, args);

		System.out.println("Hello world");
	
		ApplicationContext ac = SpringApplication.run(SpringJdbcSpringBootAppH2Application.class, args);
		Student stud = ac.getBean("student",Student.class);
		StudentService serv = ac.getBean("studentServiceImpl",StudentService.class);
		
		
		//Save
		addStudent(serv,stud);
		//GetAll
		getAllStudents(serv);
	}
	
	public static List<Student> getAllStudents(StudentService serv)
	{
		return serv.getAllStudents();
	}
	
	public static int addStudent(StudentService serv,Student stud)
	{
		stud.setRollNo(144824);
		stud.setName("tarun");
		stud.setMarks(99);
		int noOfRowsUpdated = serv.saveStudent(stud);
		System.out.println("noOfRowsUpdated: "+noOfRowsUpdated);
		return noOfRowsUpdated;
	}

}
