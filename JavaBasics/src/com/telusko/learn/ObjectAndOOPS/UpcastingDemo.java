package com.telusko.learn.ObjectAndOOPS;


class A1
{
	int marks = 10;
	int var1A = 220;
	public void show()
	{
		System.out.println(" in A "+marks);
	}
}

class B extends A1
{
	int marks = 20;
	int roll = 181;
	public void show()
	{
		System.out.println("in B "+marks);
	}
	
	public void show1()
	{
		System.out.println("in B class - show1");
	}
}

public class UpcastingDemo {

	public static void main(String[] args) {
		
		
		B obj = new B();
		System.out.println(obj.marks);
		obj.show();
		
		
		//creates an instance of subclass B
		//but the reference type is superclass A
		A1 obj2 = new B();
		//doesn't work method reference is A
		//System.out.println(obj2.roll);	
		System.out.println(obj2.marks);
		//Both have show methods
		//Subclass B overrides method from A1
		//calling that method on obj2 ref will invoke 
		//overriden method in B
		obj2.show();
		
		//doesn't work
		//if B defines a methods that are not in A1
		//those methods cannot be called on A1 reference
		//obj2.show1();
		//new B().show1();
		
		//in A class, we used reference Type to be A
		//so we get value
		//field exist in B and not in A,we cant get
		//field exist in A and not in B, we can get
		System.out.println(obj2.var1A);
	}

}
