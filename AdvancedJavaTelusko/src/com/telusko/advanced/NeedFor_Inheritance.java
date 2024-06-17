package com.telusko.advanced;

abstract class Computer
{
	abstract void typeOfDevice();
	public void code()
	{
		System.out.println("Code, compile and run...");
	}
}

class Laptop extends Computer{
	public void typeOfDevice()
	{
		System.out.println("laptop was provided");
	}
}
class Desktop extends Computer{
public void typeOfDevice()
{
	System.out.println("Desktop was provided");
}
}
class Developer
{
	public void doWork(Computer device)
	{
		device.code();
		device.typeOfDevice();
	}
}

public class NeedFor_Inheritance {

	public static void main(String[] args) {
		
		
		//Assume you are a dev and company assigns you
		//either Laptop or Desktop
		
		Developer dev1 = new Developer();
		dev1.doWork(new Laptop());
		
		Developer dev2 = new Developer();
		dev2.doWork(new Desktop());
		
		
	}

}
