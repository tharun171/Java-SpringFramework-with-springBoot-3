package com.telusko.advanced;

class A
{
	int age = 20;
	public void show()
	{
		System.out.println("in show");
	}
	
	//Inner class
	static class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		
		A obj = new A();
		System.out.println(obj.age);
		obj.show();
		
		//to get config
		//B obj1 = new B();	//B is not visible
		//for non static class B 
		//A.B obj1 = obj.new B();
		//obj.new B(); from A object creating B
		//obj1.config();
		
		//if class is not static we do like above
		//if class is static we can directly get like
		A.B obj2 = new A.B();
		obj2.config();
		
	}

}
