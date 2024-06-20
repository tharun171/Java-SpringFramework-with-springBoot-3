package com.telusko.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterWorkingNature {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23,54,3,56,87,45,24,12);

		System.out.println(list);
		//get only even
		List<Integer> list1 = list.stream()
				.filter(a -> a%2==0)
				.map(n -> n)
				.collect(Collectors.toList());
		System.out.println(list1);
		
		//How Filter works
		//Filter needs Predicate
		Predicate<Integer> predi = new Predicate<Integer>() {	
			@Override
			public boolean test(Integer t) {
				return ((t%2!=0)?true:false);
			}
		};
		
		List<Integer> onlyOdd = list.stream()
				.filter(predi)
				.map(a -> a)
				.collect(Collectors.toList());
		System.out.println(onlyOdd);
		
	}

}
