package com.learn.OOPS.Abstraction;


abstract class Animal
{
	//abstract method
	abstract void makeSound();
	
	//concrete method
	void sleep()
	{
		System.out.println("all animals sleeps.");
	}
}


class Dog extends Animal
{

	@Override
	void makeSound() {
		System.out.println("dog barks");
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args)
	{
		
		Dog dog = new Dog();
		dog.makeSound();
		dog.sleep();
	}
}
