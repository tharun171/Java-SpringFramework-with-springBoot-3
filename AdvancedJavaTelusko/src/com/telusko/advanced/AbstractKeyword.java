package com.telusko.advanced;


//we cannot create object of a abstract class
abstract class Car
{
	//diff cars have diff drive modes
	//we dont know, it varies
	//so we make it abstract, so implementation done by brands
	public abstract void drive();
	//even if we have one abstract class, we need to make class abstract
	
	//based on costly car or medium car
	public abstract void MultiAxleSuspension();
	
	//All cars plays music through stereo only
	public void playMusic()
	{
		System.out.println("Playing music - stereo");
	}	
}

class Benze extends Car
{
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("We have Manual,Auto - 4wd,AWd");
	}	
	//Benze additionally provide
	//multi axle suspension enabled
	public void MultiAxleSuspension()
	{
		System.out.println("MultiAxle suspension enabled");
	}
}

public class AbstractKeyword {
	public static void main(String[] args) 
	{
		
		//user by benze
		//benze must be able to drive and play music
		Car car1 = new Benze();
		//Benze car1 = new Benze();
		car1.drive();
		car1.playMusic();
		car1.MultiAxleSuspension();
	}
}
