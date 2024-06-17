package com.telusko.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_With_Resources {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		int i = 0;
		int j;
		
		//using this
		//The resource will get closed automatically
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			//j = 18/i;
			//System.out.println(j);
			System.out.println("Enter number to print: ");
			int num = Integer.parseInt(br.readLine());
			System.out.println("Entered num is: "+num);
		}
		/*
		//what if we don't want catch
		catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
		/*
		finally
		{
			//instead of having finally
			//we can use try with resources try()
			br.close();
			System.out.println("remaining code");
		}
		*/
	}

}
