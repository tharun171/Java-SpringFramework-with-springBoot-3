package com.telusko.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("carrot");
		hset.add("items");
		hset.add("weeks");
		hset.add("months");
		hset.add("years");
		hset.add("monday");
		hset.add("items");	//duplicate
		hset.add(null);
		hset.add("chair");
		hset.add(null);
		
	System.out.println(hset);	
	
	//Contains
	System.out.println(hset.contains("items"));
	//isEmpty
	System.out.println(hset.isEmpty());
	//Size
	System.out.println(hset.size());
	
	
	//Iterator
	Iterator<String> itr = hset.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	
	
		
		
	}
}
