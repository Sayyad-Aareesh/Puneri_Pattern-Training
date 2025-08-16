package com.inheritance;

import javax.net.ssl.SNIHostName;

class Data{
	int a = 10;
	int b = 20 ;
	
	public void show()
	{
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
	}
}

class Addition extends Data{
	public void add()
	{
		show();
		System.out.println("Add is : "+(a+b));
	}
}

class Multiplication extends Data
{
	public void Multi()
	{
		show();
		System.out.println("Multi is : "+(a*b));
	}
}

class Square extends Data
{
	public void sq()
	{
		System.out.println(" Value of a is :"+a);
		System.out.println("Square of a is :"+(a*a));
	}
	
}
public class Hirarchical {

	public static void main(String[] args) {
		
		Addition a = new Addition();
		a.add();
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		Multiplication m = new Multiplication();
		m.Multi();
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		
		Square s =new Square();
		s.sq();

	}

}
