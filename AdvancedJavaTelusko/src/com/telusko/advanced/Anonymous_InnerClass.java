package com.telusko.advanced;


class A1
{
	public void show()
	{
		System.out.println("in show - outer class");
	}
}

public class Anonymous_InnerClass {

	public static void main(String[] args) {
		
		//Creating Anonymous innerClass
		A1 obj = new A1()
		{
			
			public void show()
			{
				System.out.println("in show - A");
			}
		};
		
		obj.show();
	
	}

}
