package com.encap;

public class ProtectedAM {

	protected int a = 20;
	
	public void show()
	{
		System.out.println("Value of a is :"+a);
	}
	public static void main(String[] args)
	{
		ProtectedAM p = new ProtectedAM();
		System.out.println("Value of 'a' in main-method is "+p.a);
		p.show();
		
	}

}
