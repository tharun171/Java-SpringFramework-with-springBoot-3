package com.telusko.learn.Basics;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		//lower to higher type conversion - widening or promoting
		
		
		//higher to lower is called narrowing
		int a = 120;
		//Byte can store to -128 to 127
		//byte b = a; //add byte before a to do type conversion
		byte b = (byte)a;
		System.out.println(b);
		
		
		//by default boolean holds a false value;
		boolean c = true;
		System.out.println(c);
		
		long d = 1234567891L;	//can be small l or cap L
		float e = 5.43F;	//can be f or F
		
		Double f = 5.98765;
		 char g = 'c';
	}

}
