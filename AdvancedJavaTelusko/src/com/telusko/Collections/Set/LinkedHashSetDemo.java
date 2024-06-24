package com.telusko.Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("one");
		lhs.add("two");
		lhs.add("three");
		lhs.add("four");
		lhs.add("five");
		lhs.add("six");
		
		System.out.println(lhs);
		System.out.println(lhs);
		
	}

}
