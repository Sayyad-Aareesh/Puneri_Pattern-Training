package com.encap;

public class DefaultDemo {


	public static void main(String[] args)
	{
		DefaultAM d = new DefaultAM(); 
		System.out.println("Value of a in another class using object is :"+d.a);
		System.out.println();
		System.out.println("though the method of DefaultAm Class ,"
				+ " Access the value of default varible a is :");
		
		d.show();
	}

}
