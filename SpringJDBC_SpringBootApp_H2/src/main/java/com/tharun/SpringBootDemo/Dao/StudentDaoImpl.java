package com.tharun.SpringBootDemo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tharun.SpringBootDemo.BusinessBeans.Student;

@Repository
public class StudentDaoImpl implements StudentRepo{
	
	private JdbcTemplate repo;
	
	public JdbcTemplate getJdbc() {
		return repo;
	}

	@Autowired
	public void setJdbc(JdbcTemplate repo) {
		this.repo = repo;
	}

	@Override
	public int saveStudent(Student stu) {
		System.out.println("Added");
		String query = "insert into student(rollno,name,marks) values(?,?,?)";
		int noOfRowsUpdated = repo.update(query,stu.getRollNo(),stu.getName(),stu.getMarks());
		return noOfRowsUpdated;
	}

	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		
		RowMapper<Student> rowMap = new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setRollNo(rs.getInt("rollno"));
				student.setName(rs.getString("name"));
				student.setMarks(rs.getInt("marks"));
				return student;
			}
		};
		
		List<Student> list = repo.query(query, rowMap);
		for(Student var:list)
		{
			System.out.println(var);
		}
		return list;
	}

}
