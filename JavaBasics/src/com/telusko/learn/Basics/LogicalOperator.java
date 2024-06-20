package com.telusko.learn.Basics;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//Logical AND
		//Logical OR
		//Logical NOT
		
		int a = 5;
		int b = 6;
		int c = 9;
		int d = 19;
		
		//both needs to be true
		boolean res = (a<b && c<d);
		System.out.println(res);
		
		//one condition needs to be true
		boolean res2 = (a<b || c>d);
		System.out.println(res2);
		
		//NOT - makes true to false and vice
		boolean res3 = a>b; //false
		//converts it to true
		System.out.println(!res3);
		
	}

}
