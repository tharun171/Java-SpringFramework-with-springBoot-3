package com.telusko.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class DesSort implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return ((o1>o2)?-1:1);
	}
	
}

public class SortDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23,54,3,56,87,45,24,12);

		System.out.println(list);
		List<Integer> AscSorted = list
				.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(AscSorted);
		
		//Sort even numbers Ascending
		List<Integer> evenNumASC = list
				.stream()
				.filter(a -> a%2==0)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(evenNumASC);
		
		//ParallelStream() -uses multiple threads to make operations faster
		
		//Sort even Num Descending
		List<Integer> evenNumDES = list
				.stream()
				.filter(a -> a%2==0)
				.sorted(new DesSort())
				.collect(Collectors.toList());
		System.out.println(evenNumDES);
	}

}
