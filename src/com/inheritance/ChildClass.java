package com.inheritance;

class Parent
{
	int a =10;
	public void show()
	{
		System.out.println("Parent Class Method...");
	}
}

public class ChildClass extends Parent {
	
	int a =20;
	public void show()
	{
		System.out.println("In Parent Value of a is :"+super.a);
		
		super.show();
		
		System.out.println("Child Class Method...");
		System.out.println("In Child value of a is : "+a);
	}

	public static void main(String[] args) 
	{
		ChildClass c =new ChildClass();
		c.show();
		System.out.println("value of a using child class object : "+c.a);
		
		
	}

}
