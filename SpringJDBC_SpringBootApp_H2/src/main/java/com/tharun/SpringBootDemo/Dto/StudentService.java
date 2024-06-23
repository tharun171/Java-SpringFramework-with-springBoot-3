package com.tharun.SpringBootDemo.Dto;

import java.util.List;

import com.tharun.SpringBootDemo.BusinessBeans.Student;

public interface StudentService {

	int saveStudent(Student stu);
	
	List<Student> getAllStudents();
}
