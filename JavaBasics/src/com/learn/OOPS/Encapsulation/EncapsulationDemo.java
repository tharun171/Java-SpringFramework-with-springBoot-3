package com.learn.OOPS.Encapsulation;


class Person
{
	private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationDemo {

	public static void main(String[] args)
	{
		 Person p = new Person();
	        p.setName("John");
	        p.setAge(30);
	        System.out.println(p.getName() + " is " + p.getAge() + " years old.");
	}
}
