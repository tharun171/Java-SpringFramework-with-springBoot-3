package com.telusko.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(12);
		set1.add(23);
		set1.add(54);
		set1.add(27);
		set1.add(12);
		
		//set doesn't allows duplicates
		//doesn't follow insertion order
		System.out.println (set1);
		
		System.out.println(set1.contains(23));
		
		System.out.println(set1.isEmpty());
		System.out.println(set1.size());
		
		System.out.println(set1.getClass());
		
		Iterator<Integer> itr = set1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	}

}
