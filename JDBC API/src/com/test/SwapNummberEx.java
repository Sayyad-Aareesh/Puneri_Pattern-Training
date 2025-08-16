package com.test;

public class SwapNummberEx {

	public static void main(String[] args) {
		int a=5,b=10;
		System.out.println("Value of a before swape "+a);
		System.out.println("Value of b before swape "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println();
		
		System.out.println("Value of a After swape "+a);
		System.out.println("Value of b After swape "+b);

	}

}
