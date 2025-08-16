package com.constructor;

public class PConstructor {

	public PConstructor() {
		System.out.println("Default...");
	}
	public PConstructor(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {

		PConstructor p =new PConstructor();	//print default constructor data
		PConstructor p1 =new PConstructor("Good Morning");
		PConstructor p2 =new PConstructor("Good Night");
		
	}

}
