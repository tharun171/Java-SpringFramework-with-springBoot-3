package com.telusko.learn.ObjectAndOOPS;


class Human
{
	//using private these can be accessible by this class only
	private String name;
	private int age;
	public String species;
	
	
	public void show()
	{
		System.out.println(name+" "+age+" "+species);
	}
}

public class EncapsulationDemo {

	private String email;
	private String pass;
	
	public void func()
	{
		System.out.println("function 1 called");
	}
	
	
	public static void main(String[] args) {
		
		//Class can be considered as example of encapsulation
		
		 
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.func();
		//private var accessible coz in same class
		obj.email = "some";
		
		
		Human obj2 = new Human();
		//obj2 cant access variables as they are private
		//they are encapsulated - binded as a unit
		//we can get those using getters and setters only
		obj2.species = "homosapiens";
		//obj2.name = //doesn't work as its private
		//above variable is a public, so we are able to access
		obj2.show();
		
	}

}
