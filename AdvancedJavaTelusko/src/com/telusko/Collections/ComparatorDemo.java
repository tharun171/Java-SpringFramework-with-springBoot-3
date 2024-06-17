package com.telusko.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student
{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nStudent [age=" + age + ", name=" + name + "]";
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		//Comparator is a interface
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			
			@Override
			public int compare(Integer num1, Integer num2) {
				//Ascending o1>o2 return 1
				//Descending o1>o2 return -1
				if(num1>num2)
					return -1;
				else if(num1<num2)
					return 1;
				else
					return 0;
			}
		};
		
		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(4);
		nums.add(43);
		nums.add(14);
		nums.add(7);
		nums.add(1);
		
		/*
		System.out.println(nums);
		//By default it's Ascending
		Collections.sort(nums);
		System.out.println(nums);
		
		//using Comparator
		Collections.sort(nums,comp);
		System.out.println(nums);
		*/
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(20,"revi"));
		students.add(new Student(14,"suresh"));
		students.add(new Student(18,"ramesh"));
		students.add(new Student(23,"vsihnu"));
		students.add(new Student(12,"tarun"));
		
		//System.out.println(students.toString());
		
		//Sort using collections
		//we can't use this - The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Student>)
		//Collections.sort(students);
		
		//sort by age using comparator
		//It is an interface. so we get it like 
		//An anonymous class
		Comparator<Student> comp1 = new Comparator<Student>() {
			
			@Override
			public int compare(Student stu1, Student stu2) {
				//Ascending stu1>stu2 return 1
				//Descending stu1>stu2 return -1
				if(stu1.age>stu2.age)
					return 1;
				else if(stu1.age<stu2.age)
					return -1;
				else
					return 0;
			}
		};
		
		//sort by age
		//Collections.sort(students,comp1);
		//System.out.println(students);
		
		//sort by student name
		Comparator<Student> comp2 = new Comparator<Student>() {
			@Override
			public int compare(Student stu1, Student stu2) {
				//Ascending sort of name
				//return stu1.name.compareTo(stu2.name);
				
				//Descending sort of names
				return stu2.name.compareTo(stu1.name);
			}
		};
		
		Collections.sort(students,comp2);
		//System.out.println("Ascending sort of names");
		//System.out.println(students);
		
		System.out.println("Descending sort of names");
		System.out.println(students);
		
		
		
		
	}

}
