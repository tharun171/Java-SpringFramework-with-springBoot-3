package com.telusko.learn.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//String Buffer = mutable
		//THREAD SAFE
		
		StringBuffer str = new StringBuffer();
		//default capacity
		System.out.println(str.capacity());
		
		StringBuffer str1 = new StringBuffer("tarun");
		//16+5
		System.out.println(str1.capacity());//21
		
		System.out.println(str1.length());
		//delete at index
		str1.deleteCharAt(2);	//taun
		System.out.println(str1);
		//insert at index
		str1.insert(2,"r");	//can also insert string
		System.out.println(str1);
		
		
		//SUBSTRING
		System.out.println(str1.substring(0,2)); //ta
		
		
		//if we want to have a specific length
		str1.setLength(30);
		System.out.println("Set lenght of 30 :"+str1);
		
		//minimum capacity
		str1.ensureCapacity(50);
		
		//convert stringBuffer to string
		String str2 = str1.toString();
		
		
		
	}

}
