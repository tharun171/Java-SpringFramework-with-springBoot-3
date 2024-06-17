package com.telusko.learn;


class Demo
{
	//instance variable
	String name;
	int roll;
	
	//static variable
	static String var1;
	
	public void func1()
	{
		//local variable
		//no visibility outside the methods
		int a = 5;
	
		//instance variables have visibility here
		System.out.println(name+" "+roll+" "+Demo.var1);
		System.out.println(a);
	}
}

public class VariablesDemo {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1.name = "tarun";
		d1.roll = 1;
		
		Demo.var1="some var";
		
		d1.func1();
		
		
	}

}
