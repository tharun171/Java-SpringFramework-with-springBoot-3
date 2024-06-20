package com.telusko.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		
		//Map have key-value pair
		//order is not guaranteed
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		
		for(int i=1;i<=5;i++)
		{
			map1.put("key"+i,i*2);
		}
		
		//duplicate value
		map1.put("key6",10);
		//give duplicate key as null
		map1.put(null,0);
		//only one null will be taken
		//and previous null value will be changed
		map1.put(null,1);
		
		//same key changes the existing value of that key
		map1.put("key6",12);
		
		//get map1
		System.out.println(map1);
		//get keys
		System.out.println("keys "+map1.keySet());
		//get Values
		System.out.println("values "+map1.values());
		//get by key
		System.out.println(map1.get("key3"));
		//contains key
		System.out.println(map1.containsKey("key4"));
		//contains value
		System.out.println(map1.containsValue(6));
		
		System.out.println(map1.isEmpty());
		System.out.println(map1.size());
		
		//Both key and values
		System.out.println(map1.entrySet());
		
		for(Map.Entry<String,Integer> var:map1.entrySet())
		{
			System.out.println(var.getKey()+":"+var.getValue());
		}
		
	}

}
