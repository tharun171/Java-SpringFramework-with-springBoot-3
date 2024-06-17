package com.telusko.learn.Collections;


class Student
{
	public String name;
	public int roll;
	
	public Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		
		Student[] arr = new Student[10];
		
		for(int i=1;i<10;i++)
		{
			Student stu = new Student("name "+i, i);
			arr[i-1]=stu;
		}
		
		for(int i=1;i<arr.length;i++)
		{
			System.out.println(arr[i-1].toString());
		}

	}

}
