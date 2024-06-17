package com.telusko.learn.ObjectAndOOPS;


class A2
{
	int Avar1 = 20;
	int Avar2 = 120;
	int marks = 100;
	public A2()
	{
		System.out.println("in Costructor A");
	}
	public A2(int n)
	{
		System.out.println("in Param Construct A2 "+n);
	}
	public void show()
	{
		System.out.println("in show A "+Avar1+ "  "+Avar2);
	}
}

class B2 extends A2
{
	int Bvar1 = 10;
	int marks = 90;
	public B2()
	{
		System.out.println("in Constructor B");
	}
	public B2(int n)
	{
		//to invoke B2 default constructor
		//this();
		//By defualt we have super() here we cant see it
		//super() invokes default constructor
		//super();
		//To Call Param Constructor of A,pass the value
		super(n);
		System.out.println("in param Construct B2 "+n);
	}
	public void show()
	{
		System.out.println("in show");
		System.out.println(Bvar1);	//10
		//getting var from parent
		System.out.println(super.Avar2);	//120
		System.out.println(marks); 	//we get 90
		System.out.println(super.marks);  //get parent marks 100
		//This method overrides the show method in A
		//we want parent method too
		super.show(); 
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		
		//when object is created
		//B goes to A first and invokes A
		//Then object created for B
		//so A constructor called first and then B
		//B2 obj = new B2();
		
		
		//call param from B2 and param from A2
		//B2 obj1 = new B2(5);
		
		//call both methods show and vars from parent
		//even B overrides methods of A
		B2 obj2 = new B2(5);
		obj2.show();
	}

}
