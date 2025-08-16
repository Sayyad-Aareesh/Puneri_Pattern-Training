package com.basic;

public class Variable {
	
	int instanceVar = 10;
	static int staticVar = 30;
	public static void main(String[] args)
	{
		int localVar = 50;
		
		//System.out.println("Value of instance Variable(instanceVar) :"+instanceVar);   //it shows the error
		
		System.out.println("Value of instace Local Variable (laocalVar) :"+localVar);
		System.out.println("Value of Static Variable(staticVar) :"+staticVar);
		
		
	}

}
