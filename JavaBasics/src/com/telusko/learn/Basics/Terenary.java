package com.telusko.learn.Basics;

public class Terenary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//(condition)?(if true):(if false)
		
		int res = (3<5)?3:5;
		System.out.println(res);
		
		int a = 5;
		int b = 8;
		
		String greater = (a>b)?"a is greater":"b is greater";
		System.out.println(greater);
	}

}
