package com.mehods;

public class MethodEx {

	public void showMsg()
	{
		System.out.println("Hello Java...");
	}
	public static void main(String[] args) {
		System.out.println("Main method Start");
		MethodEx m = new MethodEx();
		m.showMsg();
		System.out.println("Show message1 executed...");
		m.showMsg();
		System.out.println("Show message2 executed...");
		System.out.println("Return in main method....");

	}

}
