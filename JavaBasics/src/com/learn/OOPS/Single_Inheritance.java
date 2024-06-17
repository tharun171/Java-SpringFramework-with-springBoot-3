package com.learn.OOPS;


class Animal
{
	void eat()
	{
		System.out.println("the animal eats food.");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("dog barks.");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		
	}

}
