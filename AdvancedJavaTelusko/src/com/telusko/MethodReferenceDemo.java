package com.telusko;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("navin","Harsh","John");
		
		System.out.println(names);
		
		List<String> upper = names.stream()
				.map(nam -> {
					return nam.toUpperCase();
				})
				.toList();
		System.out.println(upper);
		
		List<String> uNames = names.stream()
				.map(String::toUpperCase)
				.toList();
		System.out.println(uNames);
		
		
		uNames.forEach((nm) -> System.out.print(nm+" "));
		System.out.println();
		uNames.forEach(System.out::println);
	}

}
