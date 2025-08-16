package com.poly;

public class Overloading {

	public void add(int x, int y)
	{
		System.out.println("Add is : "+(x+y));
	}
	
	public void add(double x, double y)
	{
		System.out.println("Add is : "+(x+y));
	}
	
	public void add(int a, int b , int c)
	{
		System.out.println("Add is : "+(a+b+c));
	}
	
	public static void main(String[] args) {
		
		Overloading o =new Overloading();
		o.add(10, 23);
		o.add(23.0, 5);
		o.add(2, 4, 8);
	}

}
