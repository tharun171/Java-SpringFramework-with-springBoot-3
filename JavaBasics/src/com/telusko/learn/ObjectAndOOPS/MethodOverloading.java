package com.telusko.learn.ObjectAndOOPS;

class Calc
{
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public double add(int a,double b)
	{
		return a+b;
	}
	
}



public class MethodOverloading {

	public static void main(String[] args) {
		
		//Same method Name
		//can have diff return type
		//diff number of arguments
		//diff arrangement of arguments
		Calc calc = new Calc();
		System.out.println(calc.add(2,3));
		System.out.println(calc.add(2,3,5));
		System.out.println(calc.add(3, 4.4));

	}

}
