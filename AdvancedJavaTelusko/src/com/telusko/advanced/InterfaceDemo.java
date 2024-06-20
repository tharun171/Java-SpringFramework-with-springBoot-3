package com.telusko.advanced;


interface Abs2
{
	//once declared variables can't be changed
	//by default final and static
	int age = 10;
	String area = "20"; 
	
	//by default, methods are public abstract
	void show();
	void config();
}

class Abs2Impl implements Abs2
{
	@Override
	public void show() {
		System.out.println("in show impl");
	}
	@Override
	public void config() {
		System.out.println("in config impl");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		//cannot instantiate interface
		//Abs2 obj = new Abs2();
	
		Abs2 obj = new Abs2Impl();	//upcasting
		obj.show();
		obj.config();
		
		//we get the values, but they are static variables
		System.out.println(obj.age+" "+obj.area);
		//The correct way to implement them is
		System.out.println(Abs2.age+" "+Abs2.area);
		
		//final variables values cant be changed
	}

}
