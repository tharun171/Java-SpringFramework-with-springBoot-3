package com.telusko.advanced;

abstract class App
{
	public abstract void show1();
	public abstract void show2();
}

public class Abstract_Anonymous {

	public static void main(String[] args) {
		
		//Creating anonymous class for abstract implementation
		App obj = new App()
		{
			@Override
			public void show1() {
				System.out.println("inside show1 implementation");
			}
			@Override
			public void show2() {
				System.out.println("inside show2 implementation");
			}
		};
		
		obj.show1();
		obj.show2();
		
	}

}
