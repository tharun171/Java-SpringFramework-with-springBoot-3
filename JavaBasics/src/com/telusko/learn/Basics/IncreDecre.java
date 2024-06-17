package com.telusko.learn.Basics;

public class IncreDecre {

	public static void main(String[] args) {
		
		
		//Post increment num++
		//fetches the value and then increments it.
		
		//Pre increment ++num
		//increments the value and fetches it then
		
		int num = 8;
		
		int result = num++;
		//first we fecth the value and result will be 8
		//num will be 9
		System.out.println(result);
		System.out.println(num);
		
		int num2 = 15;
		int result2 = ++num2;
		//first increment the value so become 16
		//then fetches it
		//so, result2 will be 16 and num2 will be 16
		System.out.println(result2);
		System.out.println(num2);

	}

}
