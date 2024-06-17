package com.telusko.advanced;

interface parent1
{
	//by default all methods are public abstract
	void show1();
	void show2();
}
interface parent2father
{
	void show2();
	void show3();
}
interface parent2 extends parent2father
{
	
}

class child implements parent1,parent2
{
	@Override
	public void show2() {
		System.out.println("show2 impl");
	}
	@Override
	public void show1() {
		System.out.println("show1 impl");
	}
	@Override
	public void show3() {
	System.out.println("show3 impl");
	}
}

public class MultipleInheritance_Demo {

	public static void main(String[] args) {
		
		
		//get only methods in parent2
		parent2 obj = new child();	//upcasting
		obj.show2();
		obj.show3();
		
		//get only methods in parent1
		parent1 obj1 = new child();
		obj1.show1();
		obj1.show2();
		//obj1.show3();	//parent1 doesnt have show3 method
		
		
	}

}
