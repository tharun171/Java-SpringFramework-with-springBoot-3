package com.telusko.learn;


class Mobile
{
	//instance variable
	String brand;
	int price;
	//static variable
	static String name;
	
	static
	{
		System.out.println("Static block called - "
				+ "invokes only once irrespective of no of times called");
		Mobile.name = "SmartPhone";
	}
	
	//Constructor
	public Mobile()
	{
		brand = "";
		price = 200;
		//name is static and why initialize
		//every time constructor is called
		//we want static variable to initialize only once
		System.out.println("Constructor called..");
	}	
	public void show()
	{
		System.out.println(brand+" "+price+" "+name);
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		//obj1.name = "something";
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		//obj2.name = "something";
		
		
		obj1.show();
		obj2.show();
		
	}

}
