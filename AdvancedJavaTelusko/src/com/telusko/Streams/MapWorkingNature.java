package com.telusko.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapWorkingNature {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23,54,3,56,87,45,24,12);

		System.out.println(list);
		//get only even and multiply with 2
		List<Integer> list1 = list.stream()
				.filter(a -> a%2==0)
				.map(n -> n*2)
				.collect(Collectors.toList());
		System.out.println(list1);
		
		//HOW MAP WORKS
		//MAP TAKES function as parameter
		//<What it accepts,What it returns>
		Function<Integer,Integer> fun = (Integer n) -> 
		{
			return n*2;
		};
		Function<Integer,Integer> fun1 = (n) -> (n*2);
		
		
		List<Integer> onlyEven = list.stream()
				.filter(a -> a%2==0)
				.map(fun1)
				.collect(Collectors.toList());
		System.out.println(onlyEven);
		
	}

}
