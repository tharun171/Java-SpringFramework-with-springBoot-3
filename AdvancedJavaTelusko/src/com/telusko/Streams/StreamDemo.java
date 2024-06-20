package com.telusko.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(23,54,3,56,87,45,24,12);
		
		System.out.println(list);
		//FOr Each
		list.forEach(n -> System.out.print(n+" "));
		
		System.out.println();
		for(Integer var:list)
		{System.out.print(var+" ");}
		
		System.out.println();
		List<Integer> list1 = list.stream()
				.collect(Collectors.toList());
		System.out.println(list1);
		
		Stream<Integer> stream1 = list.stream();
		//For Each
		stream1.forEach(a -> System.out.print(a+" "));
		System.out.println();
		//stream1 is already used and can't be used again
		//after performing terminal operations
		
		//FILTER
		List<Integer> onlyEven = list.stream().
				filter(a -> a%2==0)
				.map(a -> a)
				.collect(Collectors.toList());
		System.out.println(onlyEven);
		
		//REDUCE
		int sum = list.
				stream().filter(n -> n%2==0)
				.map(n -> n)
				//start with 0 sum
				.reduce(0,(a,b) -> a+b);
		System.out.println(sum);
		
		
	}

}
