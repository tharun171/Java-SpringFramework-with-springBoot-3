package com.tharun.SpringBootDemo.Dao;

import java.util.List;

import com.tharun.SpringBootDemo.BusinessBeans.Student;

public interface StudentRepo {

	int saveStudent(Student stu);
	
	List<Student> getAllStudents();
}
