package com.tharun.controller2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	
	List<Student> students = new ArrayList<>(
			List.of(
					new Student(1,"revi","java"),
					new Student(2,"john","python")
					));
	
	
	//Method to get CSRF token
	//using postman we can get this token
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest req)
	{
		return (CsrfToken) req.getAttribute("_csrf");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return students;
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody
			Student stu)
	{
		students.add(stu);
	}
	
	
}
