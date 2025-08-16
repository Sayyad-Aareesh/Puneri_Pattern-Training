package com.inheritance;

public class SingleInheritance extends A{
	int b = 20 ;
	public void showB()
	{
		System.out.println("Value of b is : "+b );
		
		
	}
	public void multi()
	{
		System.out.println("Multiplication of a,b is : "+(a*b));
	}
	
	public static void main(String[] args) {
		SingleInheritance s =new SingleInheritance();
		s.show();
		s.showB();
		s.multi();
	}

}
