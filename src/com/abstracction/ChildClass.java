package com.abstracction;

abstract class Parent{
	int a=10;
	
	public Parent() 
	{
		System.out.println("Parent Class Constructor...");
	}

	public abstract void showMsg();
	
	public void showA()
	{
		System.out.println("value of A is..."+a);
	}
}
public class ChildClass extends Parent{

	int b=20;
	@Override
	public void showMsg() {
		a=a+b;
		System.out.println("Override Method ");
		System.out.println("Value of A is after adding B : "+a);
	}
	public static void main(String[] args) 
	{
		ChildClass c =new ChildClass();
		c.showMsg();
		c.showA();
	}	


}
