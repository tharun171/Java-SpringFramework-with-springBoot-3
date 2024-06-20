package com.telusko.learn.ObjectAndOOPS;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		
		
		//Wrapper classes
		//in frameworks, we work more with classes
		//object oriented, so every primitive data type has a class
		
		int num = 7;
		Integer num1 = new Integer(7);	//Boxing
		
		Integer num2 = num;		//AutoBoxing
		
		System.out.println(num1);
		System.out.println(num2);
		
		int num3 = num2.intValue();	//UnBoxing
		int num4 = num2;	//AutoUnboxing
		
		System.out.println(num3);
		System.out.println(num4);
		
		String str = "12";
		int num5 = Integer.parseInt(str);
		System.out.println(num5);
	}

}
