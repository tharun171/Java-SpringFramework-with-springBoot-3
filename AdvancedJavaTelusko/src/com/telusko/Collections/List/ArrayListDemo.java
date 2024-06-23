package com.telusko.Collections.List;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Collection<Integer> nums = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			nums.add(i);
		}
		//no get method for collection interface
		//have in child classes
		System.out.println(nums);
		
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			nums1.add(i);
		}
		
		System.out.println(nums1);
		System.out.println(nums1.get(2));
	}

}
