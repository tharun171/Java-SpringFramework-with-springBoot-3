package com.telusko.learn;

class Phone
{
	String brand;
	int price;
	static String name;
	
	public void show()
	{
		System.out.println("brand "+brand+" price "+price+" name "+name);
	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		
		Phone Obj1 = new Phone();
		Obj1.brand = "Apple";
		Obj1.price = 1500;
		Obj1.name = "smartPhone";
		
		Phone Obj2 = new Phone();
		Obj2.brand = "Samsung";
		Obj2.price = 1700;
		Obj2.name = "smartPhone";
		
		//Making variable static and changing data
		
		//Static variables should be called with their class name
		//not with their object name
		Obj1.name = "NormalPhone";
		//so it should be like below
		Phone.name = "NormalPhone";
		
		
		//changing data for Obj1 name changes for all
		//objects created and have that variable
		//static variable changes all instances
		Obj1.show();
		Obj2.show();
		
	}

}
