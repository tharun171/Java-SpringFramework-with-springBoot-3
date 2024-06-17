package com.telusko.learn.Collections;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int arr[] = {5,6,7};
		System.out.println(arr);
		System.out.println(arr.toString());
		System.out.println(Arrays.toString(arr));
		
		//arrays have fixed size
		//if we dont assign a value, they will have zeros assigned
		int arr1[] = new int[10];
		for(int i=1;i<=8;i++)
		{
			//index starts with zero
			arr1[i-1]=i;
		}
		System.out.println(Arrays.toString(arr1));
		
		//for each
		for(int var:arr1)
		{
			System.out.print(var+" ");
		}
		
	}

}
