package com.telusko.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListTo_HashSet {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("revi");
		list.add("vijju");
		list.add("ajay");
		list.add("tarun");
		list.add("kumar");
		
		HashSet<String> hs = new HashSet<String>(list);
		hs.add("tulasi");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
