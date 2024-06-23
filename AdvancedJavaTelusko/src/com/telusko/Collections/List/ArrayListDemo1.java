package com.telusko.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		List<String> list1 =  Arrays.asList("thulasi","Sreenivasa","Tharun","Kumar");
		ArrayList<String> list2 = new ArrayList<String>(list1);
		System.out.println(list2);
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		//add
		list.add("Zach Dempsey");
		list.add("Bryce Walker");
		list.add("Hannah Baker");
		list.add("Clay Jensen");
		list.add("Amy");
		list.add("Justin Foley");
		
		System.out.println(list);
		//get
		System.out.println(list.get(2));
		//add at index
		list.add(0,"Tony Padilla");
		//isEmpty
		System.out.println(list.isEmpty());
		//to Array
		Object[] strArr = list.toArray();
		System.out.println(Arrays.toString(strArr));
		//contains
		System.out.println(list.contains("Tony Padilla"));
		//index of
		System.out.println(list.indexOf("Tony Padilla"));
		//replace
		list.set(0,"Tony padila");
		System.out.println(list);
		//size
		System.out.println(list.size());
		
		//Iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
		
		for(String var:list)
		{
			System.out.println(var);
		}
		
		list.forEach((n)->System.out.print(n+" "));

				
	}

}
