package com.wrapper_classes;

public class Wrapper {

	public static void main(String[] args) {
		int a =10;
		Integer b =20;
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		
		int c = b ; //un-boxing : non-primitive to primitive.
		System.out.println("value of c is : "+c);
		
		//auto-boxing : primitive to non-primitive.
		Integer temp = a;
		System.out.println("value of temp is : "+temp);

	}

}
