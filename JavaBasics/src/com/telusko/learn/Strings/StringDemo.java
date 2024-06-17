package com.telusko.learn.Strings;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String name = new String("tarun");
		//The above is a class and when we create object
		//we used new keyword to create 
		//object will be created in heap memory
		//address reference of created object
		//will be stored in stack
		System.out.println(name);
		System.out.println(name.hashCode());
		
		System.out.println(name.charAt(2));
		System.out.println(name.concat(" kumar"));
		System.out.println(name);
		
		String name1 = "kumar";
		System.out.println(name1);
		
	}

}
