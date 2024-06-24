package com.telusko.Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		//Tree set doesnt contain null values
		//Tree set maintains items in ascending order
		ts.add("one");
		ts.add("two");
		ts.add("three");
		ts.add("four");
		ts.add("five");
		//ts.add(null);	//doesnt allow null values
		ts.add("six");
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		//ceiling - return equal or closest greatest element
		//floor - return equal or closest least element
		
		//pollFirst - get and remove the first element
		//pollLast - get and remove last element
		
		//contains
		System.out.println(ts.contains("two"));
		//isEmpty
		System.out.println(ts.isEmpty());
		//remove
		//ts.remove(obj);
		//size
		System.out.println(ts.size());
		
		//first = get first element currently in this sorted set
		System.out.println(ts.first());
		//last = get last element currently in this sorted set
		System.out.println(ts.last());
	}

}
