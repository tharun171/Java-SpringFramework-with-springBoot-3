package com.telusko.advanced;


interface Abs1
{
	//all methods are public abstract by default
	
	void show();
	void config();
}

public class Interface_Anonymous{

	public static void main(String[] args)
	{
		//Anonymous class implementation
		Abs1 obj = new Abs1()
		{
			@Override
			public void show() {
				System.out.println("in show");
			}
			@Override
			public void config() {
				System.out.println("in config");
			}
		};
		obj.show();
		obj.config();
	}
}
