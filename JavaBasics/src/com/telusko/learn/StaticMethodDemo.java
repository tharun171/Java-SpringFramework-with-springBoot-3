package com.telusko.learn;

class Phone1
{
	String brand;
	int price;
	static String name;
	
	public void show()
	{
		System.out.println("brand "+brand+" price "+price+" name "+name);
	}
	
	//when we don't pass an object
	//it doesn't know which object we are referring to
	public static void show1(Phone1 ph)
	{
		System.out.println("brand "+ph.brand+" price "+
	ph.price+" name "+Phone1.name);
		//name is a static fields
		//and should be accessed using className
	}
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		Phone1 Obj1 = new Phone1();
		Obj1.brand = "Apple";
		Obj1.price = 1500;
		Obj1.name = "smartPhone";
		
		Phone1 Obj2 = new Phone1();
		Obj2.brand = "Samsung";
		Obj2.price = 1700;
		Obj2.name = "smartPhone";
		
		//changing one instance of static variable
		//changes all instances
		Phone1.name = "NormalPhone";
		
		//non-static methods
		Obj1.show();
		Obj2.show();
		
		//Static methods
		Phone1.show1(Obj1);
	}

}
