package com.telusko.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
	private int id;
	private String name;
	public Student()
	{
		
	}
	public Student(String name)
	{
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + "]";
	}
	
}

public class ConstructorReference {

	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("ram","suresh","laksh","zachy");
		
		List<Student> students = new ArrayList<Student>();
		//Instead of using for
		//we can use Stream
		/*
		for(String name:names)
		{
			students.add(new Student(name));
		}
		*/
		
		//.map(name -> new Student(name)).toList();
		/*
		students = names.stream()
				.map(name -> 
				{
					//when we have multiple statements we use flower/curly
					return new Student(name);
				})
				.toList();
			*/
		
		//Using constructor ref
		students = names.stream()
				.map(Student::new)
				.toList();
		
		System.out.println(students);
		
	}

}
