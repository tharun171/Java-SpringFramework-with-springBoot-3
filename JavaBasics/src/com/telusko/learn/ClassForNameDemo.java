package com.telusko.learn;

class Mobile1
{
	String brand;
	int price;
	static String name;
	static
	{
		Mobile1.name = "smartPhone";
		System.out.println("static block invoked");
	}
	public Mobile1()
	{
		System.out.println("constructor invoked");
	}
}

public class ClassForNameDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		//instantiate the class
		//without invoking the constructor
		
		//we can use this
		Class.forName("com.telusko.learn.Mobile1");

}
}
