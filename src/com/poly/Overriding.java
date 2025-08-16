package com.poly;

class Parent
{
	public void show()
	{
		System.out.println("This is Parent Method");
	}
}
public class Overriding extends Parent {

	public void show()
	{
		System.out.println("This is Child Method");
	}

	
	public static void main(String[] args) {
		Overriding o = new Overriding();
		o.show();

	}

}
