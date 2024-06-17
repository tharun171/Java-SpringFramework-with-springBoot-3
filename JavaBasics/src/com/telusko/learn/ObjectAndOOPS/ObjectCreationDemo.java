package com.telusko.learn.ObjectAndOOPS;


class Calculator
{
	public int add(int num1,int num2)
	{
		return  num1+num2;
	}
}

public class ObjectCreationDemo {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(a,b));
		
			
	}

}
