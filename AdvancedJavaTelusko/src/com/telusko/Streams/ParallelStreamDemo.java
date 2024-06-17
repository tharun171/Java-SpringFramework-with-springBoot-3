package com.telusko.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		
		int size = 10_000;
		
		List<Integer> list = new ArrayList<Integer>(size);
		Random ran = new Random();
		for(int i=01;i<=size;i++)
		{
			//below 100 numbers
			list.add(ran.nextInt(100));
		}
		
		//REDUCE
		Long sum1StartTime = System.currentTimeMillis();
		int sum1 = list.stream()
				.map(a -> a)
				.reduce(0,(a,b)->a+b);
		Long sum1EndTime = System.currentTimeMillis();
		System.out.println("sum1 time -> "+(sum1EndTime-sum1StartTime));
		System.out.println(sum1);
		
		//MapToInt
		Long sum2StartTime = System.currentTimeMillis();
		int sum2 = list.stream()
				.mapToInt(b -> b)
				.sum();
		Long sum2EndTime = System.currentTimeMillis();
		System.out.println("sum2 time -> "+(sum2EndTime-sum2StartTime));
		System.out.println(sum2);
		
		//ParallelStream
		Long sum3StartTime = System.currentTimeMillis();
		int sum3 = list.parallelStream()
				.mapToInt(b -> b)
				.sum();
		Long sum3EndTime = System.currentTimeMillis();
		System.out.println("sum3 time -> "+(sum3EndTime-sum3StartTime));
		System.out.println(sum3);
		
		//When we do simple operations like this
		//ParallelStream - will take more time than stream
		//Its bcoz parallel stream responsible for creating THREADS
		//And Creating threads take time
		
		
	}

}
