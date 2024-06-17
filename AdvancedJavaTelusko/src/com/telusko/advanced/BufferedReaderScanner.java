package com.telusko.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderScanner {

	public static void main(String[] args) throws IOException {
		
		/*
		//System.in.read() - actually gives us a Ascii number
		System.out.println("Enter a char or num");
		int num = System.in.read();		//takes only one letter/num
		System.out.println("Ascii value of entered is: "+num);
		//A - 65	//a - 97  	1-49
		//To get the number what we entered
		System.out.println("Entered num is: "+(num-48));
		System.out.println("Ascii value of "+(num-48)+" is: "+num);
		*/
		
		//Buffered Reader  - java.io
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		//converts taken line to integer
		System.out.println("Enter number: ");
		int num = Integer.parseInt(br.readLine());
		System.out.println(num);
		
		br.close();
		
		//scanner is better than buffered reader
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		sc.close();
	
	}

}
