package com.telusko.learn.Collections;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		
		//used when we know 
		//how many rows we have and unsure
		//how many columns we will have in each row
		
		int rows = 3;
		
		//jagged
		int[][] arr = new int[rows][];
		
		//columns be like for 0 row = 2 columns
		//for 1=4 columns, and for 2=6 columns
		//columns we need to explicitly allocate here
		//3 rows
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[6];
		
		int n = 1;
		for(int i=0;i<rows;i++)
		{
			//System.out.println("arr[i].lenght "+arr[i].length);
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = n;
				//System.out.print(arr[i][j]);
				n++;
			}
		}

		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
