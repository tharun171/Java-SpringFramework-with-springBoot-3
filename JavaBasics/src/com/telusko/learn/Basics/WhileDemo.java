package com.telusko.learn.Basics;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=10;
		//print even start at 1
		int start = 1;
		while(start<=n)
		{
			if(start%2==0)
				System.out.print(start+" ");
			start++;
		}
	}

}
