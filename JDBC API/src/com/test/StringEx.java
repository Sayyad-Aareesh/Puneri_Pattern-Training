package com.test;

public class StringEx {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Hello User");
		
		System.out.println("String before reverse : "+str);

		System.out.println("String After reverse : "+str.reverse());
	}

}
