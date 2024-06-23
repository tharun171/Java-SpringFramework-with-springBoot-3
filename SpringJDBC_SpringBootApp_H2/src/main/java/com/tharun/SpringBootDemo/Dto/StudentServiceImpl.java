package com.tharun.SpringBootDemo.Dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tharun.SpringBootDemo.BusinessBeans.Student;
import com.tharun.SpringBootDemo.Dao.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	public StudentRepo repo;
	
	public StudentRepo getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	@Override
	public int saveStudent(Student stu) {
		return repo.saveStudent(stu);
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.getAllStudents();
	}

	

}
