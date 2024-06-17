package com.telusko.learn.Collections;

public class MulitDimensionArrayDemo {

	public static void main(String[] args) {
		
		
		//new int[rows][columns]
		
		int rows = 3;
		int columns = 2;
		
		int arr[][] = new int[rows][columns];
		
		int n=1;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j] = n;
				n++;
			}
		}
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
