package com.telusko.learn.ObjectAndOOPS;

class A
{
	public A()
	{
		System.out.println("A constructor invoked - object created");
	}

	public void show()
	{
		System.out.println("in A show");
	}
}

public class AnonymousClassesDemo {

	public static void main(String[] args) {
		
		
		//object is created
		//but it is not assigned to a variable
		//so no memory allocated in Stack
		//object creation will be happening in heap
		new A().show();
		
		//Anonymous object doesnt have its value
		//assigned to a variable
		//so nothing is stored in stack
		
	}

}
